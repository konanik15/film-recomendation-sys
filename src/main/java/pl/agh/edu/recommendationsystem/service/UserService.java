package pl.agh.edu.recommendationsystem.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.agh.edu.recommendationsystem.model.User;
import pl.agh.edu.recommendationsystem.repositiory.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User findById(long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.get();
    }

    public void addUser(String userName) {
        userRepository.save(new User(userName));
    }
}
