package BTungdungdocchuathanhso;

import java.util.Scanner;

public class readnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so can doc: ");
        int number = scanner.nextInt();

        String read;
        switch (number){
            case 0:
                read = "zero";
                break;
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "bon";
                break;
            case 5:
                read = "nam";
                break;
            case 6:
                read = "sau";
                break;
            case 7:
                read = "bay";
                break;
            case 8:
                read = "tam";
                break;
            case 9:
                read = "chin";
                break;
            case 10:
                read = "muoi";
                break;
            default:
                read = "";

               if (!read.equals("")){
                   System.out.printf("The month '%d' has %s days!", number, read);
               }else {
                   System.out.println("ko");
               }

        }
    }
}
