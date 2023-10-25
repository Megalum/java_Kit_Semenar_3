package src.task3;

public class Main {
    public static void main(String[] args) {

        Pair<Double, String> pair1 = new Pair<>(90.2, "123asd");

        System.out.println("Получение первого значения: " + pair1.getFirst() +
                ";\nПолучение второго занчения: " + pair1.getSecond() +
                ";\nПолучение строкового представления пары: " + pair1);
    }
}
