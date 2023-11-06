package com.example.Movie_Rank.mycgv.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showLanding() {

        return "landing";
    }

    @GetMapping("/admin")
    public String showAdmin() {

        return "admin/admin";
    }

    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

    @GetMapping("/employees")
    public String showHome() {
        return "index";
    }
}
