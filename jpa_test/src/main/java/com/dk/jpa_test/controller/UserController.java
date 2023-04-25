package com.dk.jpa_test.controller;


import com.dk.jpa_test.repository.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dukun
 */
@RestController
@RequestMapping("user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public Object getList() {

        Pageable pageable = PageRequest.of(1, 10, Sort.Direction.fromString("desc"), "id");
        return userRepository.getUsers(pageable);
    }
}
