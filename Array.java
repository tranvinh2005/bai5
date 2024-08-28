package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
        int number[] = new int[8];
        number[0] = 27;
        number[3] = -6;
        System.out.println(number[0]);
        if (number[3] < 0) {
            System.out.println("Element 3 is negative.");
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < 8; i++) {
            number [i]=keyboard.nextInt();
            number[i] = 2 * i;
            System.out.println(number[i]);
        }
        int e[]={0,2,4,6,8};
        e[1]=e[3]+e[4];
        System.out.println("e is"+Arrays.toString(e));
    }
//vinhtran
}
