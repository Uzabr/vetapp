package com.vet.vetapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {


    @GetMapping(value = "/userform")
    public String getUser(ModelMap modelMap) {

        return "user-form";
    }
    public String createUserForm() {
        return "redirect:/userfrom";
    }
}
