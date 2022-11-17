package com.junior.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {
    @GetMapping(value = "dashboard")
    public String getDashboard() {
        return "dashboard";
    }
}
