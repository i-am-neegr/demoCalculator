package localhost.demo.calculateService;


import localhost.demo.exception.IllegalArgumentCalculator;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import javax.print.attribute.standard.MediaSize;

@Service
public class calculateService implements calculateServiceInterface {

    @Override
    public String greet() {
        return "hi this is calculator";
    }

    @Override
    public String plus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentCalculator("please enter all numbers");
        }
        return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    @Override
    public String minus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentCalculator("please enter all numbers");

        }
        return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));

    }

    @Override
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentCalculator("please enter all numbers");

        }
        return num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));

    }

    @Override
    public String divide(String num1, String num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentCalculator("please enter all numbers");

        } else if (num2.equals("0")) {
            throw new IllegalArgumentCalculator("can't divide by zero");
//            throw new ArithmeticException("divide by zero");
        } else {
            return num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));
        }
    }
}
