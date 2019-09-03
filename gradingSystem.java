
import java.util.Scanner;
public class gradingSystem {
    public static void main(String[] args) {
       Scanner inputData = new Scanner(System.in);
       //variable Decalrations
            String fName,lName;
            double maths,eng,swa,bio,phy,sum,avg;
            //variable initialization for user input
        System.out.println("===Grading System===");
        System.out.println("Your First Name");
        fName = inputData.next();
        System.out.println("Your Last Name");
        lName = inputData.next();
        System.out.println("Mathematics");
        maths = inputData.nextInt();
        System.out.println("English");
        eng = inputData.nextInt();
        System.out.println("Kiswahili");
        swa = inputData.nextInt();
        System.out.println("Biology");
        bio = inputData.nextInt();
        System.out.println("Physics");
        phy = inputData.nextInt();

        //computations / processing

        sum = maths + eng + bio + phy+ swa;
        avg = sum/5;


        //Results
        System.out.println("\n Full Names :" +fName + " " +lName);
        System.out.println("Mathematics :" +maths);
        System.out.println("English :" +eng);
        System.out.println("Biology :" +bio);
        System.out.println("Physics :" +phy);
        System.out.println("Kiswahili :" +swa);
        System.out.println("Total Marks :" +sum);
        System.out.println("Average Marks :" +avg);

        //declaring the mean grade

        if (avg>=80 && avg<=100){
            System.out.println("Mean Grade :A");


        }
        else if (avg>=65&& avg<=79.99999){
            System.out.println("mean grade is :B");
        }
        else if (avg>=50&& avg<=64.99999){
            System.out.println("mean grade is :C");
        }
        else if (avg>=35&& avg<=49.99999){
            System.out.println("mean grade is :D");
        }
        else if (avg>=0 && avg<=34.99999){
            System.out.println("mean grade is :E");
        }
        else {
            System.out.println("mean grade is :Invalid");
        }
    }
}
