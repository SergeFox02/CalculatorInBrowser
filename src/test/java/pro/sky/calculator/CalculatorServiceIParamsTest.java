package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceIParamsTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    private static final int NUM_1 = 10;
    private static final int NUM_2 = 5;
    private static final int SUM_OF_NUMBERS = 15;
    private static final int DIFFERENCE_OF_NUMBERS = 5;
    private static final int MULTIPLY_OF_NUMBERS = 50;
    private static final int DIVISION_OF_NUMBERS = 2;
    private static final int ZERO = 0;

    public static Stream<Arguments> calculatorSumParamsTests() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, SUM_OF_NUMBERS),
                Arguments.of(NUM_1, ZERO, NUM_1)
        );
    }

    @ParameterizedTest
    @MethodSource("calculatorSumParamsTests")
    public void shouldTrueSum(int num1, int num2, int resultOfOperation) {
        int result = out.sum(num1, num2);
        assertEquals(result, resultOfOperation);
    }

    public static Stream<Arguments> calculatorDifferenceParamsTests() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, DIFFERENCE_OF_NUMBERS),
                Arguments.of(ZERO, NUM_1, - NUM_1)
        );
    }

    @ParameterizedTest
    @MethodSource("calculatorDifferenceParamsTests")
    public void shouldTrueDifference(int num1, int num2, int resultOfOperation) {
        int result = out.difference(num1, num2);
        assertEquals(result, resultOfOperation);
    }

    public static Stream<Arguments> calculatorMultiplyParamsTests() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, MULTIPLY_OF_NUMBERS),
                Arguments.of(ZERO, NUM_1, ZERO)
        );
    }

    @ParameterizedTest
    @MethodSource("calculatorMultiplyParamsTests")
    public void shouldTrueMultiply(int num1, int num2, int resultOfOperation) {
        int result = out.multiply(num1, num2);
        assertEquals(result, resultOfOperation);
    }

    public static Stream<Arguments> calculatorDivisionParamsTests() {
        return Stream.of(
                Arguments.of(NUM_1, NUM_2, DIVISION_OF_NUMBERS),
                Arguments.of(ZERO, NUM_1, ZERO)
        );
    }

    @ParameterizedTest
    @MethodSource("calculatorDivisionParamsTests")
    public void shouldTrueDivision(int num1, int num2, int resultOfOperation) {
        double result = out.divide(num1, num2);
        assertEquals(result, resultOfOperation);
    }

}