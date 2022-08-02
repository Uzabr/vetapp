package com.vet.vetapp.controller;

import com.vet.vetapp.model.UserPet;
import com.vet.vetapp.service.AnimalService;
import com.vet.vetapp.service.UserPetService;
import com.vet.vetapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/users")
public class UserController {

    private final UserPetService userPetService;
    private final AnimalService animalService;
    private final UserService userService;

    @Autowired
    public UserController (UserPetService userPetService, AnimalService animalService, UserService userService) {
        this.userPetService = userPetService;
        this.animalService = animalService;
        this.userService = userService;
    }

    @GetMapping(value = "/userform")
    public String getUser(ModelMap modelMap) {

        return "user-form";
    }
    public String createUserForm() {

        return "redirect:/userfrom";
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createPetForm(@RequestBody  UserPet userPet) {
        userPetService.createPet(userPet);
        return "";
    }

    @GetMapping("/users")
    public String getAllAnimals(ModelMap modelMap) {
        modelMap.addAttribute("animals", animalService.getAllAnimals());
        return "user-form";
    }

    public String deletePet() {
        return "";
    }

    public String updatePet() {
        return "";
    }

    public String getUserPet() {
        return "";
    }


}
