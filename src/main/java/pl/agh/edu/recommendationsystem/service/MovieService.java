package pl.agh.edu.recommendationsystem.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.agh.edu.recommendationsystem.model.Movie;

public class MovieService {
    public static RestTemplate restTemplate = new RestTemplate();
    public static final String POPULAR_MOVIES_LINK = "http://api.themoviedb.org/3/movie/popular?";
    public static final String API_KEY = "c7a878cc32dd231fed3c6987e722bcaf";
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MovieService.class);

    public static Movie getMovie(){
        String response = getPopularMovies();
        log.info(response);
        return null;
    }

    private static String getPopularMovies() {
        return restTemplate.getForObject(POPULAR_MOVIES_LINK + "api_key=" + API_KEY + "&language=pl-PL&page=1",
                String.class);
    }
}
