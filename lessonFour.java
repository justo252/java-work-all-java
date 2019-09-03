
import java.util.Scanner;

public class lessonFour {
    public static void main(String[] args) {
        //instantiaitng an object of scanner
        Scanner inputData = new Scanner(System.in);
        //declaring variables for user input
        int num1;
        float num2;
        double num3;
        String first_name, last_name;
        //initializng variables via prompts
        System.out.print("Enter Interger Value : ");
        num1 = inputData . nextInt();
        System.out.print("Enter Decimal Value : ");
        num2 = inputData . nextFloat();
        System.out.print("Enter double Value : ");
        num3 = inputData . nextDouble();
        System.out.print("Enter First Name : ");
        first_name = inputData . next();
        System.out.print("Enter Last Name : ");
        last_name = inputData.next();

        //results
        System.out.println("...The Folloqwing is the info entered by the user");
        System.out.println("Interger Value: " + num1);
        System.out.println("Decimal Value: " + num2);
        System.out.println("double Value: " + num3);
        System.out.println("Full Names: " + first_name + " " + last_name);
    }

}
