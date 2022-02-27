package com.blz.oopsLineComparison;
    import java.util.Scanner;
public class OopsLineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Computation Program");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the line coordinates");
        System.out.println("enter x1");
        int x1 = input.nextInt();
        System.out.println("enter x2");
        int x2 = input.nextInt();
        System.out.println("enter y1");
        int y1 = input.nextInt();
        System.out.println("enter y2");
        int y2 = input.nextInt();
        double lenOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("length of the line = " + lenOfLine);

    }
}
