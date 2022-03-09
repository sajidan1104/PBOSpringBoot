package id.ac.uin.latihan1.latihan1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("API")
public class IndexController {
    @GetMapping("Hello")
    public String Hello(){
        return"anjay pake springboot";
    }
}
