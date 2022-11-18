package com.junior.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {
    @GetMapping(value = "dashboard")
    public String getDashboard(@AuthenticationPrincipal User userDetails, Model model) {
        model.addAttribute("userDetails", userDetails);
        return "dashboard";
    }
}
