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

        System.out.println("Enter the second line coordinates");
        System.out.println("enter p1");
        int p1=input.nextInt();
        System.out.println("enter p2");
        int p2=input.nextInt();
        System.out.println("enter q1");
        int q1=input.nextInt();
        System.out.println("enter q2");
        int q2=input.nextInt();

        Double firstLineLength = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("length of the line = " + firstLineLength);

        Double secondLineLength = Math.sqrt(Math.pow((p2 - p1), 2) + Math.pow((q2 - q1), 2));
        System.out.println("length of the line = " + secondLineLength);

        int compare = firstLineLength.compareTo(secondLineLength);
        System.out.println(compare);
        if(compare < 0){
            System.out.println("First Line length is less than Second line");
        } else if(compare > 0) {
            System.out.println("First Line length is Greater than Second line");
        } else {
            System.out.println("Both first and second line lengths are equal");
        }
    }
}
