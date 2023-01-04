package agh.frs.controller;

import agh.frs.model.Result;
import agh.frs.repository.UserRepository;
import agh.frs.security.SecurityConstant;
import agh.frs.service.MovieRecommendationService;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieRecommendationController {



    @Autowired
    UserRepository userRepository;

    @GetMapping("/api/movie/getRecommendationForMovie/{movieId}")
    @CrossOrigin
    public Result getRecommendation(@PathVariable int movieId, @RequestHeader("Authorization") String token, @RequestHeader("User") String username){

        try {
//            String username;
            if (token.startsWith("Bearer ")) Jwts.parser().setSigningKey(SecurityConstant.JWT_SECRET).parseClaimsJws(token.substring(7));
            else Jwts.parser().setSigningKey(SecurityConstant.JWT_SECRET).parseClaimsJws(token);
            // gettingData
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//            if (principal instanceof UserDetails) {
//                username = ((UserDetails)principal).getUsername();
//            } else {
//                username = principal.toString();
//            }
            userRepository.setMovieIdById(movieId,username);
            return MovieRecommendationService.getRecommendation(movieId);
        }catch (Exception ex){
            throw new AuthenticationCredentialsNotFoundException("JWT was expired or incorrect");
        }
    }


}
