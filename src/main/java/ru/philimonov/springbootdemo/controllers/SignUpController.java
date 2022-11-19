package ru.philimonov.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.philimonov.springbootdemo.models.User;
import ru.philimonov.springbootdemo.repositories.UsersRepository;

@Controller
public class SignUpController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp_page";
    }

    @PostMapping("/signUp")
    public String signUpUser(User user) {
        usersRepository.save(user);
        return "redirect:/signUp";
    }
}
