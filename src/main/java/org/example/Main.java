package org.example;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = list.stream().filter(x -> x % 2 == 0).reduce(0, Integer::sum);
        int count = (int) list.stream().filter(x -> x % 2 == 0).count();
        double average = (double) sum / count;

        System.out.printf("Среднее арифметическое всех чётных: %.2f", average );
    }
}