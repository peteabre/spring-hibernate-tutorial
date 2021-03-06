package no.ciber.tutorial.spring_hibernate.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class IndexController {

    private String message = "Hello world";

    @RequestMapping(value = "/", method = GET)
    @ResponseBody
    public String showIndex() {
        return message;
    }
}
