package TTtinhsocannag;

import java.util.Scanner;

public class Calculatebody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height , bmi ;

        System.out.print("kilogam");
        weight = scanner.nextDouble();

        System.out.print("mester");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height,2);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18){
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        }else if (bmi < 25){
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }else if (bmi < 30){
            System.out.printf("%-20.2f%s", bmi, "overweight");
        }else {
            System.out.printf("%-20.2f%s", bmi, "obese");
        }
    }
}
