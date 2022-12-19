package agh.frs.repositiory;

import agh.frs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByName(String name);
    Boolean existsByName(String name);



//    List<User> findByNameAndPassword(String name, String password);

//    do zmiany
//    User findByName(String name);
}
