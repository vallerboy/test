package pl.oskarpolak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lenovo on 01.09.2017.
 */
@Controller
public class TestController {
    @GetMapping("/hello")
    @ResponseBody
    public String register() {
        return "SIEMA!";
    }
}
