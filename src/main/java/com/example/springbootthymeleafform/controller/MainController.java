package com.example.springbootthymeleafform.controller;

import com.example.springbootthymeleafform.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/register")
    public String home(Model model){
        User user = new User();
        model.addAttribute("user",user);
        List<String> profesionList = Arrays.asList("Developer","Boss","Dancer");
        model.addAttribute("profesionList", profesionList) ;
        return "register-form";
    }
    @PostMapping("/register")
    public String sumbitForm(@ModelAttribute("user")User user){
        return "register_sussesful";
    }
}
