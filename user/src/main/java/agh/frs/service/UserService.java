package agh.frs.service;


import agh.frs.model.User;
import agh.frs.repositiory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;
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

    public void createUser(String userName) {
        userRepository.save(new User(userName));
    }

    public List<User> findAll() {
        List<User> userList = new ArrayList<User>();
        for (User user : userRepository.findAll()) {
            userList.add(user);
        }

        return userList;

    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
