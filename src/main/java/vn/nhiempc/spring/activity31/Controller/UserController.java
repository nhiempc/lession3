package vn.nhiempc.spring.activity31.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.nhiempc.spring.activity31.Model.User;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class UserController {
//    String url = "http://localhost:8080/user";
//
//    HttpURLConnection httpClient;
//
//    {
//        try {
//            httpClient = (HttpURLConnection) new URL(url).openConnection();
//            httpClient.setRequestMethod("GET");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    @GetMapping(value = "/user")
    public User getUser(){
        User user = new User();
        user.setName("Nhiệm");
        user.setEmail("nhiem10596@gmail.com");
        return user;
    }
}
