package localhost.demo;

import localhost.demo.calculateService.calculateService;
import localhost.demo.calculateService.calculateServiceInterface;
import localhost.demo.exception.IllegalArgumentCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class calculateController {

    private final calculateServiceInterface service;

    public calculateController(calculateServiceInterface calculateService) {
        service = calculateService;
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

    @ExceptionHandler(IllegalArgumentCalculator.class)
    public ResponseEntity handleIllegalArgumentException(IllegalArgumentCalculator calculator) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

}
