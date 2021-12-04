package BTchuyendoitiente;

import java.util.Scanner;

public class Moneychange {
    public static void main(String[] args) {
        double VND;
        double USD;
        double rate = 23000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị USD :");

        USD = scanner.nextDouble();
        double change = USD * rate;
        System.out.println(" Giátrị của VND :" + change);

        System.out.println("nhập giá trị VND :");
        VND = scanner.nextDouble();
        double change1 = VND / rate;
        System.out.println("giá trị của USD:" + change1);


    }
}
