public class lessonTwo {
    public static void main(String[] args) {
        //declaring variables
        int num1;
        float num2; //Floating-point numbers are numbers that have fractional parts (usually expressed with a decimal point).
        double num3; //The double variable can hold very large (or small) numbers. It also holds float
        char letter;
        String full_names;

        //initializng Variables
        num1 = 23;
        num2 = 12.345f;
        num3 = 123432.6789;
        letter = 'A';
        full_names = "Justice Kip";

        //results
        System.out.println("Integerger Value : " + num1);
        //in java you concatenate using a + sign
        System.out.println("Decimal Value : " + num2);
        System.out.println("Double Value : " + num3);
        System.out.println("First Letter : " + letter);
        System.out.println("Full names : " + full_names);
    }
}
