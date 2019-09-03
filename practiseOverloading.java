public class practiseOverloading {

    int addNums(int num1,int num2,int num3){
        int sum = num1+num2+num3;
        return sum;
    }
    float addNums(float num1,float num2,float num3){
        float sum = num1+num2+num3;
        return sum;
    }
    double addNums(double num1,double num2,double num3){
        double sum = num1+num2+num3;
        return sum;
    }

    public static void main(String[] args) {
        practiseOverloading overloads = new practiseOverloading();
        System.out.println("sum of intergers    :"+overloads.addNums(23,45,67));
        System.out.println("sum of double       :"+overloads.addNums(22345,34567,34567));
        System.out.println("sum of float        :"+overloads.addNums(4.6,34.6,54.7));
    }

    /**
     * return is a reserved keyword in Java i.e, we can’t use it as an identifier.
     * It is used to exit from a method, with or without a value.
     */

}
