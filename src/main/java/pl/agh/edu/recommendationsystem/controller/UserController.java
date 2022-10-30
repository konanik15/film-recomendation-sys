package pl.agh.edu.recommendationsystem.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.agh.edu.recommendationsystem.model.User;
import pl.agh.edu.recommendationsystem.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("HelloWorld")
    public String helloWorld(){
        return "Hi from Spring Boot";
    }

    @PostMapping("/api/user")
    public void newUser(@RequestBody String userName) {
        userService.addUser(userName);
        System.out.println("User " + userName + "created :)");
    }


    @GetMapping("api/user/{id}")
    public User getUserById(@PathVariable long id) throws Exception {
        return userService.findById(id);
    }

}
