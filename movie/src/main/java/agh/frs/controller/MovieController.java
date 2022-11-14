package agh.frs.controller;

import agh.frs.model.Movie;
import agh.frs.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequiredArgsConstructor
public class MovieController {
    //private final MovieService movieService;

    @GetMapping("/api/movie/getMovie")
    public Movie getMovie(){
        System.out.println("");
        return MovieService.getMovie();
    }
}
