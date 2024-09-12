package com.test.test02;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class SymmetricEncryption {

    public static SecretKey getSecretKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        AES Key Size it can be 192, 256
        keyGenerator.init(128);
        return keyGenerator.generateKey();
    }

    public static SecretKey getSecretKey(String encodedSecretKey) {
        byte[] decodedKey = Base64.getDecoder().decode(encodedSecretKey);
        return new SecretKeySpec(decodedKey, "AES");
    }

//    Initialization Vector produces a randomIV to ensure that
//    same plain text doesn't yield the same cipher Text
    public static byte[] generateIV() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return iv;
    }

    public static byte[] getIV(String encodedIV) {
        return Base64.getDecoder().decode(encodedIV);
    }

    public static String encrypt(String algorithm, String plainText, SecretKey secretKey, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithm);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String algorithm, String encryptedText, SecretKey secretKey, byte[] iv) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithm);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText.getBytes()));
        return new String(decryptedBytes);
    }


    public static void main(String[] args) throws Exception {
//        EncryptionNDecryption();
        DecryptionViaProperties();
    }

    public static void EncryptionNDecryption() throws Exception {
//        Padding is required to ensure that the
//        input data fits into a fixed block size
        String algorithm = "AES/CBC/PKCS5Padding";
        String input = "Secret Property!";

        SecretKey secretKey = getSecretKey();
        byte[] iv = generateIV();

        System.out.println("Secret Key: " + Base64.getEncoder().encodeToString(secretKey.getEncoded()));
        System.out.println("IV: " + Base64.getEncoder().encodeToString(iv));
        String encryptedText = encrypt(algorithm, input, secretKey, iv);
        System.out.println(encryptedText);

        String decryptedText = decrypt(algorithm, encryptedText, secretKey, iv);
        System.out.println(decryptedText);
    }

    public static void DecryptionViaProperties() throws Exception {
        String algorithm = "AES/CBC/PKCS5Padding";

        SecretKey secretKey = getSecretKey("gaQ6Utc7u1YTKrxnb2tiGg==");
        byte[] iv = getIV("4aikOHNBWVYOM93ru4QVzA==");

        String encryptedText = "Y5MJiXCYs5RjNv9njsR1wAQYsG3VPQAVCdyz8oEq07Y=";

        String decryptedText = decrypt(algorithm, encryptedText, secretKey, iv);
        System.out.println(decryptedText);
    }
}
