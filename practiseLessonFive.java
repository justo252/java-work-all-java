public class practiseLessonFive {
    public static void main(String[] args) {
        //declaring and initializing variables for computations
        float num1,num2,sum,product,divsn,remdr,diff;
        //initializng variables:
        num1 = 34.8f;
        num2 = 785.98f;

        sum = num1 + num2;
        diff = num1 - num2;
        divsn = num1 / num2;
        product = num1 * num2;
        remdr = num1 % num2;

        //results

        System.out.println("First Number is              :" + num1);
        System.out.println("Second Number is             :" + num2 + "\n");
        System.out.println("Sum is                       :" + sum);
        System.out.println("Division is                  :" + divsn);
        System.out.println("Production is                :" + product);
        System.out.println("remainder is                 :" + remdr);


    }
}
