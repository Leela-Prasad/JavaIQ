package com.test.test01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Service
public class GenreService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${baseUrl}")
    private String baseUrl;

    @Value("${api.key}")
    private String apiKey;

    public String getGenres() {
      var url = UriComponentsBuilder.fromHttpUrl(String.join("", baseUrl, "/genres"))
                                    .queryParam("key", apiKey)
                                    .build()
                                    .encode()
                                    .toUriString();

      var response =  restTemplate.getForEntity(url, String.class);
      return response.getBody();
    }
}
