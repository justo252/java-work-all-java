import java.util.Scanner;

public class payrollProject {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        //variable Declaration
        String id,fName,lName,gender,marital;
        double basic,house,transport,medical,bonus,gross,payee,nssf,nhif,net;

        //initializing variables using prompts

        System.out.print("Payroll System");
        System.out.print("Input Staff ID   :");
        id=inputData.next();
        System.out.print("First Name       :");
        fName=inputData.next();
        System.out.print("Last Name        :");
        lName=inputData.next();
        System.out.print("Gender-Indicate if Male or Female  :");
        gender=inputData.next();
        System.out.print("Marital Status-Indicate if Single,Married, Divorced, Widowed or Separated        :");
        marital=inputData.next();
        System.out.print("Basic Salary        :");
        basic=inputData.nextInt();

        //computations/processing

        house=basic*1.2;
        transport=house-house*0.075;
        medical=transport+transport*0.0327;
        System.out.println("Full Names");

        //bonus calculations
        if(gender=="male"&&marital=="married"){
             bonus=0.15*basic;
        }
        else if (gender=="female"&&marital=="married"){
            bonus=0.125*basic;
        }
        else {
            bonus = 0.0975*basic;
        }


        gross=basic+house+transport+medical+bonus;


        //PAYEE calculations
        if (gross>=0 && gross<=10000){
            payee=gross*0.05;
        }
        else if (gross>=10001 && gross<=20000){
            payee=gross*0.1;
        }
        else if (gross>=20001 && gross<=30000){
            payee=gross*0.2;
        }
        else {
            payee=gross*0.3;
        }

        nssf=gross*0.15;
        nhif=nssf+3500;
        net=gross-nssf-nhif;

        //results

        System.out.println("====Employee Details======");





    }

}
/**
 * Java Programming Task
 * 1. Write a payroll program that enables a user to perform the following tasks:
 * 		a) Input the following:
 * 				- Staff ID
 * 				- First Name
 * 				- Last Name
 * 				- Gender (Male or Female)
 * 				- Marital Status (Single, Married, Divorced, Widowed, Separated)
 * 				- Basic Salary
 * 		b) Perform the following computations given the formulas below:
 * 				- House Allowance = 20% of Basic Salary
 * 				- Transport Allowance is less House Allowance by 7.45%
 * 				- Medical Allowance exceeds Transport Allowance by 3.27%
 * 				- Bonus is calculated as follows:
 * 						i) Male and Married = 15% of Basic Salary
 * 						ii) Female and Married = 12.5% of Basic Salary
 * 						iii) Others = 9.75% of Basic Salary
 * 				- Gross Pay = Basic Salary + House Allowance + Transport Allowance + Medical Allowance + Bonus
 * 				- PAYEE is calculated as follows :
 * 						i) Gross Pay is between 0 to 10,000 = 5% of Gross Pay
 * 						ii) Gross Pay is between 10,001 to 20,000 = 10% of Gross Pay
 * 						iii) Gross Pay is between 20,001 to 30,000 = 20% of Gross Pay
 * 						ii) Gross Pay is above 30,000 = 30% of Gross Pay
 * 				- NSSF = 15% of Gross Pay
 * 				- NHIF exceeds NSSF by 3,500
 * 				- Net Pay = Gross Pay - PAYEE - NSSF - NHIF
 * 		c) Display (a) and (b) above.
 */
