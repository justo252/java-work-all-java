
import java.util.Scanner;
public class javaProjectOne {
    public static void main(String[] args) {
        //instatiating object of the scanner
        Scanner inputData = new Scanner(System.in);
        //declaring variables for user input

        double num1,num2,num3,num4,num5,sum,avg;
        String first_name,last_name;

        //initializing variables using prompts

        System.out.println("Enter First Name :");
        first_name = inputData .next();
        System.out.println("Enter Last Name  :");
        last_name = inputData .next();
        System.out.println("Maths Grade      :");
        num1 = inputData .nextInt();
        System.out.println("English Grade    :");
        num2 = inputData .nextInt();
        System.out.println("Biology Grade     :");
        num3 = inputData .nextInt();
        System.out.println("Physics Grade     :");
        num4 = inputData .nextInt();
        System.out.println("Chemistry Grade   :");
        num5 = inputData .nextInt();
        System.out.println("Average is        :");
        sum = inputData.nextInt();





    }
}
