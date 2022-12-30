package agh.frs.controller;

import agh.frs.model.Result;
import agh.frs.security.SecurityConstant;
import agh.frs.service.MovieRecommendationService;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieRecommendationController {
    @GetMapping("/api/movie/getRecommendationForMovie/{movieId}")
    @CrossOrigin
    public Result getRecommendation(@PathVariable int movieId, @RequestHeader("Authorization") String token){
        try {
            if (token.startsWith("Bearer ")) Jwts.parser().setSigningKey(SecurityConstant.JWT_SECRET).parseClaimsJws(token.substring(7));
            else Jwts.parser().setSigningKey(SecurityConstant.JWT_SECRET).parseClaimsJws(token);
            return MovieRecommendationService.getRecommendation(movieId);
        }catch (Exception ex){
            throw new AuthenticationCredentialsNotFoundException("JWT was expired or incorrect");
        }
    }
}
