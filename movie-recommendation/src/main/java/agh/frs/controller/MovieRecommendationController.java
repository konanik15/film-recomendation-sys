package agh.frs.controller;

import agh.frs.model.Result;
import agh.frs.service.MovieRecommendationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRecommendationController {
    @GetMapping("/api/movie/getRecommendationForMovie/{movieId}")
    @CrossOrigin
    public Result getRecommendation(@PathVariable int movieId){
        return MovieRecommendationService.getRecommendation(movieId);
    }
}
