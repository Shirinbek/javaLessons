package calculator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

//        double[] dB = new double[3];

        for(;;) {

            int index = 0;

            double firstOne = first();

            double secondOne = second();

            char symbol = operator();

            double res = calculate(firstOne, secondOne, symbol);

            double[] dB = dB(index, res);

            int test = indexDB(dB);

            System.out.println(test);

            System.out.print("Press 'q' for exit, else press any key: ");
            String s = reader().next();
            if (s.equals("q")){break;} else continue;

        }

    }

    public static Scanner reader(){

        return new Scanner(System.in);

    }

    public static double first() {

        System.out.print("Введите первое число: ");
        return reader().nextDouble();

    }

    public static double second() {

        System.out.print("Введите второе число: ");
        return reader().nextDouble();

    }

    public static char operator() {

        System.out.print("Введите оператор: (+, -, *, /): ");
        return reader().next().charAt(0);

    }

    public static double calculate(double first, double second, char symbol) {

        double result = 0.0;

        switch (symbol) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' -> result = first * second;
            case '/' -> result = first / second;
            default -> System.out.print("Введите корректный оператор: ");
        }
        System.out.printf("%.1f %c %.1f = %.1f\n", first, symbol, second, result);
        return result;

    }

    public static int indexDB(double[] dataBase) {

        int index = 0;
        for (int i = 0; i < dataBase.length; i++) {
            if (dataBase[i] == 0.0) {
                index = i;
            }
        }
        return index;
    }

    public static double[] dB(int index, double res) {
        double[] dB = new double[3];
        dB[index] = res;
        return dB;
    }


}




