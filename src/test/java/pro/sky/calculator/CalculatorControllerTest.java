package pro.sky.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    private static final int NUM_1 = 10;
    private static final int NUM_2 = 5;
    private static final int SUM_OF_NUMBERS = 15;
    private static final int DIFFERENCE_OF_NUMBERS = 5;
    private static final int MULTIPLY_OF_NUMBERS = 50;
    private static final int DIVISION_OF_NUMBERS = 2;
    private static final int ZERO = 0;

    @Test
    public void shouldReturnTrueResultOfSum() {
        int result = out.sum(NUM_1, NUM_2);
        assertEquals(result, SUM_OF_NUMBERS);
    }

    @Test
    public void shouldReturnTrueResultOfSumNum1AndZero() {
        int result = out.sum(NUM_1, ZERO);
        assertEquals(result, NUM_1);
    }

    @Test
    public void shouldReturnTrueResultOfDifference() {
        int result = out.difference(NUM_1, NUM_2);
        assertEquals(result, DIFFERENCE_OF_NUMBERS);
    }

    @Test
    public void shouldReturnTrueResultOfDifferenceNum1AndZero() {
        int result = out.difference(ZERO, NUM_1);
        assertEquals(result, - NUM_1);
    }

    @Test
    public void shouldReturnTrueResultOfMultiply() {
        int result = out.multiply(NUM_1, NUM_2);
        assertEquals(result, MULTIPLY_OF_NUMBERS);
    }

    @Test
    public void shouldReturnTrueResultOfMultiplyNum1AndZero() {
        int result = out.multiply(NUM_1, ZERO);
        assertEquals(result, ZERO);
    }

    @Test
    public void shouldReturnTrueResultOfDivision() {
        double result = out.divide(NUM_1, NUM_2);
        assertEquals(result, DIVISION_OF_NUMBERS);
    }

    @Test
    public void shouldExceptionWhenDivisionOnZero() {
        assertThrows(IllegalArgumentExceptionDivisionByZero.class, () -> out.divide(NUM_1, ZERO));
    }
}