package authentication;

import agh.frs.config.LoadDatabase;
import agh.frs.controller.UserController;
import agh.frs.repositiory.UserRepository;
import agh.frs.service.UserService;
import authentication.config.RSAKeyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RSAKeyProperties.class)
public class AuthenticationApplication {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private static UserService userService = new UserService();
    @Autowired
    private static UserController userController = new UserController(userService);

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationApplication.class, args);

        userController.createUser("testing", "testing");
    }
}