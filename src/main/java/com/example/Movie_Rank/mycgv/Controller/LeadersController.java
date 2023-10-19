package com.example.Movie_Rank.mycgv.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeadersController {

    @GetMapping("/leaders")
        public String showLeaders() {

            return "leaders";
        }
    }

