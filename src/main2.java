import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
         float width;
         float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter width :");
        width = scanner.nextFloat();

        System.out.println("enter heigth");

        height = scanner.nextFloat();

        float Area = width * height;

        System.out.println("Area is" + Area );

    }
}
