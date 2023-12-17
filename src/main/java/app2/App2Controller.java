package app2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @GetMapping("/app2")
    public String app2() {
        return "app2";
    }
}
