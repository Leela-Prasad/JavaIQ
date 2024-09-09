package com.test.test01.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.test01.model.GenreResponse;
import com.test.test01.service.GenreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenreController {

    @Autowired
    private GenreService genreService;

    @Autowired
    private ObjectMapper objectMapper;

    @Operation(summary = "Get Genres", description = "Returns List of Genres",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "List of Genres",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = GenreResponse.class),
                                    examples = {
                                            @ExampleObject(name = "Genres", value = "{\"results\":[{\"id\":4,\"slug\":\"action\",\"games\":[{\"id\":3498,\"slug\":\"grand-theft-auto-v\"},{\"id\":3328,\"slug\":\"the-witcher-3-wild-hunt\"},{\"id\":5286,\"slug\":\"tomb-raider\"},{\"id\":13536,\"slug\":\"portal\"},{\"id\":12020,\"slug\":\"left-4-dead-2\"},{\"id\":5679,\"slug\":\"the-elder-scrolls-v-skyrim\"}]}]}"),
                                            @ExampleObject(name = "Genres2", value = "{\"results\":[{\"id\":51,\"slug\":\"indie\",\"games\":[{\"id\":1030,\"slug\":\"limbo\"},{\"id\":422,\"slug\":\"terraria\"},{\"id\":3272,\"slug\":\"rocket-league\"},{\"id\":9767,\"slug\":\"hollow-knight\"},{\"id\":3612,\"slug\":\"hotline-miami\"},{\"id\":3790,\"slug\":\"outlast\"}]}]}")
                                    }
                            )
                    ),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Processing Error",
                            content = @Content(
                                    mediaType = "application/json",
                                    examples = @ExampleObject(name = "Error Response", value = "{\"results\":[],\"error\":{\"message\":\"Sorry, unexpected error occurred\"}}")
                            )
                    )
            }
    )
    @GetMapping(value = "/genres", produces = MediaType.APPLICATION_JSON_VALUE)
    public GenreResponse genres() throws Exception {
        return objectMapper.readValue(genreService.getGenres(), GenreResponse.class);
    }

    @Operation(summary = "test", description = "test",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Genre Object",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = GenreResponse.class),
                            examples = @ExampleObject(name = "Genres", value = "{\"results\":[{\"id\":4,\"slug\":\"action\",\"games\":[{\"id\":3498,\"slug\":\"grand-theft-auto-v\"},{\"id\":3328,\"slug\":\"the-witcher-3-wild-hunt\"},{\"id\":5286,\"slug\":\"tomb-raider\"},{\"id\":13536,\"slug\":\"portal\"},{\"id\":12020,\"slug\":\"left-4-dead-2\"},{\"id\":5679,\"slug\":\"the-elder-scrolls-v-skyrim\"}]}]}")
                    )
            )
    )
    @PostMapping(value = "/test", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void test(@RequestBody GenreResponse body) {
        System.out.println(body);
    }
}
