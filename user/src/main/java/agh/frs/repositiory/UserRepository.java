package agh.frs.repositiory;

import agh.frs.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<User,Long> {


//    do wywalenia?
    List<User> findByNameAndPassword(String name, String password);
//    List<User> findByPassword(String password);
}
