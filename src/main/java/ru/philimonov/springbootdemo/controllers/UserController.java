package ru.philimonov.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.philimonov.springbootdemo.models.User;
import ru.philimonov.springbootdemo.repositories.UsersRepository;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage(Model model) {
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users_page";
    }
}
