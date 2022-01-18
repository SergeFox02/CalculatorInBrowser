package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String showHelloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String sum(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String difference(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        } else
            return "Деление на 0 в Java запрещено! \nВедите корректное число num2.";
    }
}
