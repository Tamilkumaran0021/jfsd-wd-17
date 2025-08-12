package com.example.demo_spring_thymeleaf.controller;

import com.example.demo_spring_thymeleaf.model.User;
import com.example.demo_spring_thymeleaf.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("admin", "admin@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable_expression";
    }

    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("admin", "admin@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "selection_expression";
    }

    @GetMapping("message-expression")
    public String messageExpression(Model model) {
        return "message_expression";
    }

    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link_expression";
    }

    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment_expression";
    }

    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("admin", "admin@gmail.com", "ADMIN", "Male");
        User john = new User("john", "john@gmail.com", "USER", "Male");
        User peter = new User("peter", "peter@gmail.com", "USER", "Male");

        List<User> list = Arrays.asList(admin, john, peter);

        model.addAttribute("users", list);

        return "users";
    }

    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        User admin = new User("admin", "admin@gmail.com", "ADMIN", "Male");
        User john = new User("john", "john@gmail.com", "USER", "Male");
        User peter = new User("peter", "peter@gmail.com", "USER", "Male");

        List<User> list = Arrays.asList(admin, john, peter);

        model.addAttribute("users", list);

        return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        User admin = new User("admin", "admin@gmail.com", "ADMIN", "Male");
        User john = new User("john", "john@gmail.com", "USER", "Male");
        User peter = new User("peter", "peter@gmail.com", "USER", "Male");

        List<User> list = Arrays.asList(admin, john, peter);

        model.addAttribute("users", list);

        return "switch-case";
    }

    @GetMapping("register")
    public String userRegistrationPage(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> professionsList = Arrays.asList("developer", "tester", "architect");
        model.addAttribute("professionsList", professionsList);

        return "register-form";
    }

    @PostMapping("/register/save")
    public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "register_success";
    }

}
