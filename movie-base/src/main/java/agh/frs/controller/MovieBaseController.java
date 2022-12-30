package agh.frs.controller;

import agh.frs.model.Result;
import agh.frs.security.SecurityConstant;
import agh.frs.service.MovieBaseService;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieBaseController {
    @CrossOrigin
    @GetMapping("/api/movie/getMovies")
    public Result getRecommendation(@RequestHeader("Authorization") String token){
        try {
            if (token.startsWith("Bearer ")) Jwts.parser().setSigningKey(SecurityConstant.JWT_SECRET).parseClaimsJws(token.substring(7));
            else Jwts.parser().setSigningKey(SecurityConstant.JWT_SECRET).parseClaimsJws(token);
            return MovieBaseService.getMovies();
        }catch (Exception ex) {
            throw new AuthenticationCredentialsNotFoundException("JWT was expired or incorrect");
        }
    }
}