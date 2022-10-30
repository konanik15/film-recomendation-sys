package pl.agh.edu.recommendationsystem.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.agh.edu.recommendationsystem.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
