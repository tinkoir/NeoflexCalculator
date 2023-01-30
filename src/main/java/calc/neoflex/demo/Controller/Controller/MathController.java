package calc.neoflex.demo.Controller.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    @GetMapping("/sum/{a}/{b}")
    public Integer sumOfTwo(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }
    @GetMapping("sub/{a}/{b}")
    public Integer subOfTwo(@PathVariable Integer a, @PathVariable Integer b) {
        return a - b;
    }
}
