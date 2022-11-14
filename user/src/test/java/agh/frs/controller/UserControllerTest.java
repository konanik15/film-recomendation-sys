//package pl.agh.edu.recomendationsystem.controller;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import pl.agh.edu.recomendationsystem.model.User;
//import pl.agh.edu.recomendationsystem.service.UserService;
//
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@ExtendWith(SpringExtension.class)
//@WebMvcTest(UserController.class)
//public class UserControllerTest {
//    @MockBean
//    UserService userService;
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Test
//    public void testGetById() throws Exception {
//        User user = new User().withId(1).withName("Daniel");
//
//        when(userService.findById(1)).thenReturn(user);
//
//        ResultActions result = mockMvc.perform(get(“/api/user/1”))
//            .andExpect(status().isOk())
//                .andExpect(jsonPath(“$.name”).value(“Boots”));
//
//        verify(userService).findById(1);
//
//    }
//}
