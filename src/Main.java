import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //WHILE LOOPS
        //1.)
        int count = 0;

        while (count <= 24) {
            System.out.println(count);
            count++;
        }

        //2.)
        int count2 = 15;
        while (count2 >= 0) {
            System.out.println(count2);
            count2 = count2 - 1;
        }

        //3.)
        int count3 = 0;
        while (count3 <= 75) {
            System.out.println(count3);
            count3 = count3 + 5;
        }

        //4.)
        int count4 = 18;
        while (count4 >= 0) {
            System.out.println(count4);
            count4 = count4 - 2;
        }


        //FOR LOOPS
        //5.)
        for (int rows = 1; rows <= 4; rows++){
            for (int stars = 1; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //6.)
        for(int rows2 = 1; rows2 <= 4; rows2++){
            for(int stars2 = 4; stars2 >= rows2; stars2 = stars2 - 1){
                System.out.print("*");
            }
            System.out.println();
        }

        //7.)
        for (int count7 = 1; count7 <= 3; count7++) {
            System.out.println("*****");
        }


    }
}

