package app2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2Controller {

    @GetMapping("/app2")
    public String app2() {
        return "app2";
    }

    @GetMapping("/app2/featur1")
    public String feature1() {
        return "feature1";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome Home!!";
    }


}
