package com.blz.oopsLineComparison;

    import java.util.Scanner;

public class OopsLineComparison {
        double x1, x2, y1, y2;
        Double line1,line2;
        //initializing inputs of line coordinates from the user
        public void coOrdinates(){
            Scanner input=new Scanner(System.in);
            System.out.println("enter x1");
            x1 = input.nextInt();
            System.out.println("enter x2");
            x2 = input.nextInt();
            System.out.println("enter y1");
            y1 = input.nextInt();
            System.out.println("enter y2");
            y2 = input.nextInt();
        }
        //method to calculate length of line
        public Double length() {
            Double lenOfLine=Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            return lenOfLine;
        }

         //method to check equality of two lines
         public void equal(Double length1,Double length2){
              line1 = length1;
              line2 = length2;
              boolean equality = line1.equals(line2);
              System.out.println(equality);
              if(!equality){
                  System.out.println("Two lengths of the lines are not equal");
              } else {
                  System.out.println("Two lengths of the lines are equal");
              }
        }
    //method to compare two lengths of the lines
        public void compare(Double length1,Double length2){
            line1 = length1;
            line2 = length2;
            int equality = line1.compareTo(line2);
            System.out.println(equality);
            if(equality < 0){
                System.out.println("First Line length is less than Second line");
            } else if(equality > 0) {
                System.out.println("First Line length is Greater than Second line");
            } else {
                System.out.println("Both first and second line lengths are equal");
            }
        }
        //main method to behave/initialize methods and objects
        public static void main(String[] args) {
            System.out.println("Welcome to line Comparison Computation Program");
            //initializing first line coordinates from the user
            OopsLineComparison firstLine = new OopsLineComparison();
            OopsLineComparison secondLine = new OopsLineComparison();
            //initializing first line coordinates from the user
            System.out.println("Enter the first line coordinates");
            firstLine.coOrdinates();
            //initializing second line coordinates from the use
            System.out.println("Enter the second line coordinates");
            secondLine.coOrdinates();
            //printing out the first line length using length method
            Double firstLineLength= firstLine.length();
            System.out.println( "First line length is " + firstLineLength);
            //printing out the second line length using length method
            Double secondLineLength = secondLine.length();
            System.out.println("Second line length is " + secondLineLength);
            //initializing length of two lines to equals method
            OopsLineComparison check = new OopsLineComparison();
            check.equal(firstLineLength,secondLineLength);
            //initializing length of two lines to compare method
            check.compare(firstLineLength,secondLineLength);
        }
}
