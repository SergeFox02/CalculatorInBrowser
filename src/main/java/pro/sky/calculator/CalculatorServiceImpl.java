package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String showHelloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int difference(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else
            return 0;
    }
}
