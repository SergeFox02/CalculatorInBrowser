package pro.sky.calculator;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus()
public class IllegalArgumentExceptionDivisionByZero extends RuntimeException{
    public IllegalArgumentExceptionDivisionByZero(String massage) {
        super(massage);
    }
}
