package com.franciszekszaniecki.give_in_good_hands.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class LoginController {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String loginUser() {
        return "/user/loginForm";
    }


}
