package btc.study.jaewoocho.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostAPIController {

    @PostMapping(value = "/greet")
    public String greetFunc(@RequestBody(required = false) GreetRequest request){
        
        if(request != null){
            return "Hello, " + request.getName() + ". request로 들어온 파라미터입니다.";
        } else {
            return "파라미터값이 없습니다.";
        }
    }
    
    static class GreetRequest {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

    }
}
