//package pl.agh.edu.recomendationsystem.service;
//
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import pl.agh.edu.recomendationsystem.model.User;
//import pl.agh.edu.recomendationsystem.repositiories.UserRepository;
//
//import java.util.Optional;
//
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class userServiceTest {
//
//    @Mock
//    UserRepository userRepository;
//
//    @Test
//    public void getCatById() throws Exception {
//        UserService userService = new UserService(userRepository);
//        Optional<User> user = Optional.of(new User().withId().withName("Daniel"));
//
//        when(userRepository.findById(1L)).thenReturn(user);
//        User foundUser = userService.findById(1);
//        assertThat(foundUser).isEqualTo(user.get());
//        verify(userRepository).findById(1L);
//    }
//}
