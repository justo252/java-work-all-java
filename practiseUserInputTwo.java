import java.util.Scanner;
public class practiseUserInputTwo {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        practiseUserInputOne varsInput = new practiseUserInputOne();

        System.out.println("Enter Integer Value");
        varsInput.num1 = inputData.nextInt();
        System.out.println("Enter Decimal Value");
        varsInput.num2=inputData.nextInt();
        System.out.println("Enter Float Value");
        varsInput.num3 = inputData.nextDouble();
        System.out.println("Enter First Name");
        varsInput.fName=inputData.next();
        System.out.println("Enter Last Name");
        varsInput.lName=inputData.next();

        //results
        System.out.println("The following is the list of data entered");
        System.out.println("==========================================");
        System.out.println("Interger Value:"+varsInput.num1);
        System.out.println("Decimal Value ;"+varsInput.num2);
        System.out.println("Float Value   ;"+varsInput.num3);
        System.out.println("First Name     :"+varsInput.fName);
        System.out.println("Last Name      ;"+varsInput.lName);


    }
}
