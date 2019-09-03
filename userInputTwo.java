import java.util.Scanner;
public class userInputTwo {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        userInputOne varsInput = new userInputOne();

        System.out.print("Enter Interger Value");
        varsInput.num1 = inputData.nextInt();
        System.out.print("Enter Decimal Value");
        varsInput.num2=inputData.nextFloat();
        System.out.print("Enter Float Value");
        varsInput.num3=inputData.nextDouble();
        System.out.print("Enter First Name");
        varsInput.fName=inputData.next();
        System.out.print("Enter Last Name");
        varsInput.fName=inputData.next();

        //results

        System.out.println("\n The following is the entered data:\n");
        System.out.println("========================================");
        System.out.println("Interger Value:"+varsInput.num1);
        System.out.println("Decimal Value:"+varsInput.num2);
        System.out.println("Double Value:"+varsInput.num3);
        System.out.println("Full Names:"+varsInput.fName+""+varsInput.lName);

    }
}
