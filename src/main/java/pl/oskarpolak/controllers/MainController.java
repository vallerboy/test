package pl.oskarpolak.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.oskarpolak.models.forms.RegisterForm;
import pl.oskarpolak.models.services.FileService;
import pl.oskarpolak.models.services.RandomStringService;

import javax.validation.Valid;

/**
 * Created by Lenovo on 01.09.2017.
 */
@Controller
public class MainController {

    @Autowired
    RandomStringService stringService;

    @Autowired
    FileService fileService;

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String indexGet(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String indexPost(@ModelAttribute @Valid RegisterForm form,
                            BindingResult result){

        if(result.hasErrors()){
            System.out.println("Form ma błędy");
        }
        return "register";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return stringService.getRandomString();
    }

    @GetMapping("/addfile/{text}")
    @ResponseBody
    public String addFile(@PathVariable("text") String text){
        fileService.addToFile(text);
        return "Dodano!";
    }
}
