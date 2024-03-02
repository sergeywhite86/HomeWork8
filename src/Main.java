import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] numbers = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        String[] countries = {"Japan", "Russia", "USA", "China"};

        System.out.println("Task2");
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) System.out.print(numbers[i] + ",");
            else System.out.print(numbers[i] + "\n");
        }
        for (int i = 0; i < doubles.length; i++) {
            if (i != doubles.length - 1) System.out.print(doubles[i] + ",");
            else System.out.print(doubles[i] + "\n");
        }
        for (int i = 0; i < countries.length; i++) {
            if (i != countries.length - 1) System.out.print(countries[i] + ",");
            else System.out.print(countries[i] + "\n");
        }

        System.out.println("Task3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(numbers[i] + ",");
            else System.out.print(numbers[i] + "\n");
        }
        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(doubles[i] + ",");
            else System.out.print(doubles[i] + "\n");
        }
        for (int i = countries.length - 1; i >= 0; i--) {
            if (i != 0) System.out.print(countries[i] + ",");
            else System.out.print(countries[i] + "\n");
        }

        System.out.println("Task4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) numbers[i] = numbers[i] + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}