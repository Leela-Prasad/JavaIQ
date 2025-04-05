package test;

import java.util.HashSet;
import java.util.Set;

    public class Exercise3 {

        /*public static void main(String[] args) {
            int[] numbers = {1, 4, 6, 3, 7, 2, 9, 10, 12, 14};
            int targetSum = 10;
            findPairsWithSum(numbers, targetSum);
        }

        public static void findPairsWithSum(int[] numbers, int targetSum) {
            Set<Integer> seenNumbers = new HashSet<>();
            Set<String> foundPairs = new HashSet<>();

            for (int number : numbers) {
                int complement = targetSum - number;
                if (seenNumbers.contains(complement)) {
                    String pair = Math.min(number, complement) + "," + Math.max(number, complement);
                    if (!foundPairs.contains(pair)) {
                        System.out.println("(" + complement + ", " + number + ")");
                        foundPairs.add(pair);
                    }
                }
                seenNumbers.add(number);
            }
        }*/
    }
