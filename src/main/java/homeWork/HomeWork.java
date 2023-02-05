package homeWork;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Расскажите о вашем друге :)");

        System.out.println("Как зовут вашего друга ? ");
        String name = in.nextLine();

        System.out.println("Сколько лет вашему другу ? ");
        String age = in.nextLine();

        System.out.println("Моему другу " + name + " на данный момент " + age + " лет");

    }
}
