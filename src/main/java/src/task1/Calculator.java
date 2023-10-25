package src.task1;

public class Calculator {

    public static <T extends Number> double sum(T firstNumber, T secondNumber){
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public static <T extends Number> double sub(T firstNumber, T secondNumber){
        return firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    public static <T extends Number> double mul(T firstNumber, T secondNumber){
        return firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    public static <T extends Number> double div(T firstNumber, T secondNumber){
        if (secondNumber.doubleValue() == 0)
            throw new ArithmeticException("Делить на ноль нельзя!");
        return firstNumber.doubleValue() / secondNumber.doubleValue();

    }
}
