package com.example.Aegis.Controller;

import com.example.Aegis.AegisApplication;
import com.example.Aegis.domain.User;
import com.example.Aegis.domain.User_Role;
import com.example.Aegis.repository.User_Repo;
import com.example.Aegis.repository.User_Role_Repo;
import com.example.Aegis.service.User_Role_Service;
import com.example.Aegis.service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.std;

@Controller
public class UserController {

    @Autowired
    private User_Service service;

    //
    @RequestMapping("/signup")
    public String viewHomePage(Model model) {
        List<User> listUser = service.listAll();
        // service.listAll().stream().filter();
        model.addAttribute("listUser", listUser);
        return "signup";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("user1", new User());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user1") User std) {
        ApplicationContext context= SpringApplication.run(AegisApplication.class, "args");
        User_Repo userRepo=context.getBean(User_Repo.class);
       User_Role user_role= userRepo.findById(Long.getLong("1")).get().getUserRole();
        std.setUserRole(user_role);
        service.save(std);
        return "redirect:/signup";
    }

    @RequestMapping("/edit/{userId}")
    public ModelAndView showEditUserPage(@PathVariable(name = "userId") int userId) {
        ModelAndView mav = new ModelAndView("new");
        User std = service.get(userId);
        mav.addObject("user1", std);
        return mav;
    }
    @RequestMapping(value="/delete/{userId}",method = RequestMethod.GET)
    public String deleteUser(@PathVariable(name = "userId") int userId) {
        service.delete(userId);
        return "redirect:/signup";
    }

    }

