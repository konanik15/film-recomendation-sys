package agh.frs.service;

import agh.frs.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;


public class MovieService {
    public static RestTemplate restTemplate = new RestTemplate();
    public static final String POPULAR_MOVIES_LINK = "http://api.themoviedb.org/3/movie/popular?";
    public static final String API_KEY = "c7a878cc32dd231fed3c6987e722bcaf";
    private static final Logger log = LoggerFactory.getLogger(MovieService.class);

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
