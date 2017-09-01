package pl.oskarpolak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.models.forms.RegisterForm;

import javax.validation.Valid;

/**
 * Created by Lenovo on 01.09.2017.
 */
@Controller
public class MainController {

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String indexGet(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String indexPost(@ModelAttribute("registerForm") @Valid RegisterForm form,
                            BindingResult result){
        if(result.hasErrors()){
            System.out.println("Form ma błędy");
        }
        return "register";
    }
}
