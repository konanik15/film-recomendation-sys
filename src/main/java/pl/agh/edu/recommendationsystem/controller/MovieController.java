package pl.agh.edu.recommendationsystem.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.agh.edu.recommendationsystem.model.Movie;
import pl.agh.edu.recommendationsystem.service.MovieService;


@RestController
//@RequiredArgsConstructor
public class MovieController {
    //private final MovieService movieService;

    @GetMapping("/movie")
    public Movie getMovie(){
        return MovieService.getMovie();
    }
}
