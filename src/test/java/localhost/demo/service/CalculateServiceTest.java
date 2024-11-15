package localhost.demo.service;

import localhost.demo.calculateService.calculateService;
import localhost.demo.exception.IllegalArgumentCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static localhost.demo.constants.CalculateServiceTestConstants.*;

public class CalculateServiceTest {
    private final calculateService calService = new calculateService();

    @Test
    public void testPlus() {
        String result1 = calService.plus(num1, num2);
        Assertions.assertEquals(plus12, result1);

        String result2 = calService.plus(num3, num4);
        Assertions.assertEquals(plus34, result2);
    }

    @Test
    public void testMinus() {
        String result1 = calService.minus(num1, num2);
        Assertions.assertEquals(minus12, result1);

        String result2 = calService.minus(num3, num4);
        Assertions.assertEquals(minus34, result2);
    }

    @Test
    public void testMultiply() {
        String result1 = calService.multiply(num1, num2);
        Assertions.assertEquals(multiply12, result1);

        String result2 = calService.multiply(num3, num4);
        Assertions.assertEquals(multiply34, result2);
    }

    @Test
    public void testDivide() {
        String result1 = calService.divide(num1, num2);
        Assertions.assertEquals(divide12, result1);

        String result2 = calService.divide(num3, num4);
        Assertions.assertEquals(divide34, result2);

        Assertions.assertThrows(IllegalArgumentCalculator.class, () -> calService.divide(num4, "0"));
    }

}
