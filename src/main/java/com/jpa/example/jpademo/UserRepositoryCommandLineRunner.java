package com.jpa.example.jpademo;

import com.jpa.example.jpademo.entities.User;
import com.jpa.example.jpademo.services.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Jane", "User");

        userRepository.save(user);
        log.info("New user created : " + user);

        Optional<User> firstUser = userRepository.findById(1L);
        log.info("User with id one : " + firstUser);

        List<User> users = userRepository.findAll();
        log.info("All users : " + users);
    }
}
