package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Person;

@Controller
public class PersonController {

    @ResponseBody
    @RequestMapping("/")
    String entry() {
        return "My Spring Boot App.";
    }

    @RequestMapping("/person")
    public String person(Model model) {
        Person p = new Person();
        p.setFirstName("Braxton");
        p.setLastName("White");
        p.setAge(20);
        model.addAttribute("person", p);
        return "personview";
    }

}
