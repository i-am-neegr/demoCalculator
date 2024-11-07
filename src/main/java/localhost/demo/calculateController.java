package localhost.demo;

import localhost.demo.calculateService.calculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculateController {
    private final calculateService service;

    public calculateController() {
        service = new calculateService();
    }

    @GetMapping
    public String lobby() {
        return service.greet();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) String num1,
                       @RequestParam(value = "num2", required = false) String num2) {
        return service.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) String num1,
                        @RequestParam(value = "num2", required = false) String num2) {
        return service.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) String num1,
                           @RequestParam(value = "num2", required = false) String num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) String num1,
                         @RequestParam(value = "num2", required = false) String num2) {
        return service.divide(num1, num2);
    }
}
