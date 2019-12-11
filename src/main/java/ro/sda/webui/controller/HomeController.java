package ro.sda.webui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class HomeController {

    @GetMapping(path="/")
    public String homePage(){
        return "index";//stie sa-mi ia fisierul html din template daca nu ii pun @ResponseBody(care returneaza exact stringu si nu mai cauta nimic)
        //cu tymeleaf face aceste asocieri

    }

    @GetMapping("items")
    public String items(){
        return "items";
    }

    @GetMapping("menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("operation")
    public String operation(){
        return "operation.html";
    }
}
