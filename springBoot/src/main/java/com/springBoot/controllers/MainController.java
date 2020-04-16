package com.springBoot.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
