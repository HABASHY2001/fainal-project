package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Vistula");
        return "greeting"; // This tells Spring to render greeting.html from templates
    }
}
