
import java.util.Scanner;
public class practiseLessonFour {
    public static void main(String[] args) {
        //instantiating an object of scanner
        Scanner inputData = new Scanner(System.in);
        //declaring variables for user input
        int num1;
        float num2;
        double num3;
        String first_name,second_name;
        //initializing variables using prompts
        System.out.println("Enter Integer Value : ");
        num1 = inputData .nextInt();
        System.out.println("Enter Decimal Value :");
        num2 = inputData .nextFloat();
        System.out.println("Enter Double Value : ");
        num3 = inputData .nextDouble();
        System.out.println("Enter First Name");
        first_name = inputData.next();
        System.out.println("Enter Last Name");
        second_name = inputData.next();

        //results
        System.out.println("....The Followinng is the info entered by the users :");
        System.out.println("Integer Value : "+ num1);
        System.out.println("Decimal Value: " + num2);
        System.out.println("Double Value :" + num3);
        System.out.println("Full Names : " + first_name +" " + second_name  );




    }
}
