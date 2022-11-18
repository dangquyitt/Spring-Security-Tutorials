package com.junior.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(@AuthenticationPrincipal User userDetails) {
        if(userDetails == null) {
            return "login";
        }
        return "redirect:/dashboard";
    }
}
