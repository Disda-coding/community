package life.disda.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(name ="name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
