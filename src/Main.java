import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        for (double fractionalNumber : fractionalNumbers) System.out.println(fractionalNumber);

        String[] fruits = {"Яблоко", "Банан", "Апельсин"};
        System.out.println(fruits[0]);
        System.out.println(fruits[2]);

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(fractionalNumbers));
        System.out.println(Arrays.toString(fruits));

        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i] + ", ");
        }
        System.out.println();
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.print(fruits[i] + "; ");
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}