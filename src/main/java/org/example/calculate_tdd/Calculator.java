package org.example.calculate_tdd;

import org.example.calculate.*;
import org.example.calculate_tdd.calculate.*;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperator = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {

        return arithmeticOperator.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("옳바른 사칙연산이 아닙니다."));
    }
}
