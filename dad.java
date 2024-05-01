import java.util.*;
import java.io.*;

public class dad {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number you want to find the fact of it : ");
        double x = read.nextInt();
        long startTime = System.nanoTime();
        double count = 1;
        for (int i = 1; i <= x; i++) {
            count = count * i;
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime); // الوقت بالنانوثانية
        System.out.println("the factorial of the number that you insert : " + count
                + "and the time in iterative : " + duration);
        long startT = System.nanoTime();
        fact(x) ; 
        long endT = System.nanoTime();
        long durat = (endT - startT); // الوقت بالنانوثانية
        System.out.println("the factorial of the number that you insert : "+fact(x)+" and the time in recursive : " + durat);
    }

    public static double fact(double n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
