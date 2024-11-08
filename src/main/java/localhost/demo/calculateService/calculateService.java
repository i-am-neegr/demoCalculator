package localhost.demo.calculateService;


import org.springframework.stereotype.Service;

@Service
public class calculateService implements calculateServiceInterface {

    @Override
    public String greet() {
        return "hi this is calculator";
    }

    @Override
    public String plus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "please enter all numbers";
        }
        return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    @Override
    public String minus(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "please enter all numbers";
        }
        return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));

    }

    @Override
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "please enter all numbers";
        }
        return num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));

    }

    @Override
    public String divide(String num1, String num2) {
        if (num1 == null || num2 == null) {
            return "please enter all numbers";
        } else if (num1.equals("0") || num2.equals("0")) {
            return "can't divide by zero";
//            throw new ArithmeticException("divide by zero");
        } else {
            return num1 + " / " + num2 + " = " + (Integer.parseInt(num1) / Integer.parseInt(num2));
        }
    }
}
