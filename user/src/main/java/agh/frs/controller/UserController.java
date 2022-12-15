package agh.frs.controller;


import agh.frs.model.User;
import agh.frs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("HelloWorld")
    public String helloWorld(){
        return "Hi from Spring Boot";
    }




    @PostMapping("/api/user/createUser")
    public void createUser(@RequestBody String userName, String userPassword) {
        userService.createUser(userName, userPassword);
        System.out.println("User " + userName + "created :)");
    }

    @DeleteMapping("/api/user/deleteUser/{id}")
    public void deleteUser(@PathVariable long id) throws Exception {
        userService.deleteUser(id);
        System.out.println("User with id:" + id + " deleted :)");
    }



    @GetMapping("api/user/findUser/{id}")
    public User getUserById(@PathVariable long id) throws Exception {
        return userService.findById(id);
    }

    @GetMapping("/api/user/getUserList")
    public List<User> getUsers() {
        return userService.findAll();
    }//    @Bean
//    CommandLineRunner initDatabase(UserRepository repositiory) {
//        return args -> {
//            log.info("Preloading " + repositiory.save(new User("Franek","12345")));
//            log.info("Preloading " + repositiory.save(new User("Dawid","password")));
//        };
//    }

//    do wywalenia
    @GetMapping("/api/user/findByNameAndPassword")
    public List<User> findByNameAndPassword(String userName, String userPassword){return userService.findByNameAndPassword(userName, userPassword);}

}
