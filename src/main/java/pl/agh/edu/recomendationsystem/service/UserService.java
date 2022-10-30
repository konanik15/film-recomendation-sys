package pl.agh.edu.recomendationsystem.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.agh.edu.recomendationsystem.model.User;
import pl.agh.edu.recomendationsystem.repositiory.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;


    public User findById(long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }
}
