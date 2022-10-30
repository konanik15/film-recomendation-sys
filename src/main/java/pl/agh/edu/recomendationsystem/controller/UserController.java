package pl.agh.edu.recomendationsystem.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.agh.edu.recomendationsystem.model.User;
import pl.agh.edu.recomendationsystem.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

    @GetMapping("api/user")
    public void newUser() {

    }







//    @GetMapping("api/user/{id}")
//    public User getUserById(@PathVariable long id) throws Exception {
//        return UserService.findById(id);
//    }
}
