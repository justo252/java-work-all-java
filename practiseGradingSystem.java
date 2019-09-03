import java.util.Scanner;

public class practiseGradingSystem {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        //variables declartion:
        String fName,lName;
        double maths,swa,phy,chem,eng,sum,avg;

        //initializing variables using prompts:

        System.out.println("===Grading System===");
        System.out.println("Your First Name");
        fName = inputData.next();
        System.out.println("Your Last Name");
        lName = inputData.next();
        System.out.println("Mathematics");
        maths=inputData.nextInt();
        System.out.println("Kiswali");
        swa=inputData.nextInt();
        System.out.println("Physics");
        phy=inputData.nextInt();
        System.out.println("Chemistry");
        chem=inputData.nextInt();
        System.out.println("English");
        eng=inputData.nextInt();

        //computations/processing
        sum=maths+swa+phy+chem+eng;
        avg= sum/5;

        //results

        System.out.println("\n Full Names  :"+fName +" "+lName);
        System.out.println("Mathematics"+maths);
        System.out.println("Kiswahili"+swa);
        System.out.println("Physics"+phy);
        System.out.println("Chemistry"+chem);
        System.out.println("English"+eng);

        //
        if (avg>=80&&avg<=80){
            System.out.println("Mean Grade is A");
        }
        else if (avg>=65&&avg<=79.99) {
            System.out.println("The grade is B");
        }
        else if (avg>=50&&avg<=64.99){
            System.out.println("The Grade is C");
        }
        else if (avg>=35&&avg<=49.999)
        {
            System.out.println("The Grade is D");
        }
        else if (avg>=0&&avg<=34.99){
            System.out.println("The Grade is E");
        }
        else {
            System.out.println("Mean Grade is Invalid");
        }


    }
}


