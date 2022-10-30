package pl.agh.edu.recomendationsystem.repositiories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.agh.edu.recomendationsystem.model.User;

public interface UserRepositiory extends JpaRepository<User,Long> {

}
