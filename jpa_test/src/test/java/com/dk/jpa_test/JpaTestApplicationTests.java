package com.dk.jpa_test;

import com.dk.jpa_test.entity.User;
import com.dk.jpa_test.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class JpaTestApplicationTests {

    @Autowired
    private UserRepository userRepository;


    @Test
    void contextLoads() {
//        Optional<User> one = userRepository.findById("123");
//        System.out.println(one.get());
        Pageable pageable = PageRequest.of(1, 10, Sort.Direction.fromString("desc"), "id");
//        Page<User> users1 = userRepository.getUsers(pageable);
        Page<User> users1 = userRepository.getUsers(pageable);
//        List<User> users1 = userRepository.getUsers(1, 10);
        users1.forEach(System.out::println);


//        List<Map<String, String>> users = userRepository.getUsers();
//        System.out.println(users);

    }

}
