package localhost.demo.service;

import localhost.demo.calculateService.calculateService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static localhost.demo.constants.CalculateServiceTestConstants.*;

public class CalculateServiceParametrizedTest {
    private final calculateService calService = new calculateService();

    @ParameterizedTest
    @MethodSource("plusParams")
    public void testAddition(String a, String b, String expected) {
        String result1 = calService.plus(a, b);
        Assertions.assertEquals(expected, result1);
    }

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(num1, num2, plus12),
                Arguments.of(num3, num4, plus34)
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    public void testSubtraction(String a, String b, String expected) {
        String result1 = calService.minus(a, b);
        Assertions.assertEquals(expected, result1);
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(num1, num2, minus12),
                Arguments.of(num3, num4, minus34)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    public void testMultiplication(String a, String b, String expected) {
        String result1 = calService.multiply(a, b);
        Assertions.assertEquals(expected, result1);
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(num1, num2, multiply12),
                Arguments.of(num3, num4, multiply34)
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    public void testDivision(String a, String b, String expected) {
        String result1 = calService.divide(a, b);
        Assertions.assertEquals(expected, result1);
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(num1, num2, divide12),
                Arguments.of(num3, num4, divide34)
        );
    }

}
