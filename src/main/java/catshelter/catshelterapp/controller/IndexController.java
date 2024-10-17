package catshelter.catshelterapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }
    @GetMapping("/mission")
    public String mission() {
        return "mission";
    }
    @GetMapping("/contacts")
    public String contact() {
        return "contacts";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/cats")
    public String cats() {
        return "cats";
    }

    public String login(Model model) {
        return "login";
    }

    public String loginError() {
        return "login-error";
    }
}
