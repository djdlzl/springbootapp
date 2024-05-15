package btc.study.jaewoocho.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAPIController {

    @PostMapping(value = "/greet")
    public String greetFunc(@RequestBody String name){
        return "Hello, " + name;
    }
    
}
