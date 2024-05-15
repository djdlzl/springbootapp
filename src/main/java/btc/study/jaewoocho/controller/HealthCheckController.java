package btc.study.jaewoocho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    
    @GetMapping(value = "/hc")
    public String healthCheck() {
        return "OK";
    }
}