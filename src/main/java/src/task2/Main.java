package src.task2;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray1 = {3, 5, 7, 8, 2};
        Double[] doubleArray1 = {12.5, 5.0, 12.0, 1.0, 6.0};
        String[] stringArray1 = {"sd", "sh", "geg"};

        Integer[] intArray2 = {12, 5, 12, 1, 6, 9};
        Double[] doubleArray2 = {12.0, 5.0, 12.0, 1.0, 6.0, 9.0};

        Integer[] intArray3 = {3, 5, 7, 8, 2};
        Double[] doubleArray3 = {12.5, 5.0, 12.0, 1.0, 6.0, 9.0};
        String[] stringArray3 = {"sd", "sh", "gg"};

        System.out.println("Массивы одинаковые: " + compareArrays(intArray1, intArray3));
        System.out.println("Массивы неодинаковые по длине: " + compareArrays(doubleArray1, doubleArray3));
        System.out.println("Массивы неодинаковые по значениям: " + compareArrays(stringArray1, stringArray3));
        System.out.println("Массивы неодинаковые по типу данных: " + compareArrays(intArray2, doubleArray2));
    }

    public static <T> boolean compareArrays(T[] firstArray, T[] secondArray){
        if (firstArray.length != secondArray.length)
            return false;

        for (int i = 0; i < firstArray.length; i++)
            if (!firstArray[i].equals(secondArray[i]))
                return false;

        return true;
    }

}
