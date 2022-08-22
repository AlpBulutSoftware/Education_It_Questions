package jqb01_variables;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping:" + n1 + "-" + n2);

        // 2 farklı şekilde yapılabilir
        /*
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping:" + n1 + "-" + n2);
        */

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After swapping: " + n1 + "-" + n2);
    }
}
/*
Enter 2 numbers to swap
56
42
Before swapping:56.0-42.0
After swapping: 42.0-56.0
 */