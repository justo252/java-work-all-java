public class lessonFive {
    public static void main(String[] args) {
        //Declaring and Initializing variables for computations
        float num1,num2,sum,prod,diff,divsn,remndr;
        //initializing variables

        num1 = 57.67f;
        num2 = 34.67f;

        //computations /proccessiing

        sum = num1 + num2 ;
        prod = num1 * num2 ;
        diff = num1 - num2 ;
        divsn = num1 / num2 ;
        remndr = num1 % num2 ;

        //results

        System.out.println("First Number       : " + num1);
        System.out.println("Second Number      : " + num2 + "\n");
        System.out.println("Sum is             : " + sum);
        System.out.println("product is         : " + prod);
        System.out.println("Difference is      : " + diff);
        System.out.println("Division is        : " + divsn);
        System.out.println("Remainder is       : " + remndr);


    }
}
