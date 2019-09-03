public class overloadingExample {
    int addNums(int num1,int num2,int num3){
        int sum = num1+num2+num3;
        return sum;
    }
    float addNums(float num1,float num2,float num3) {
        float sum = num1 + num2 + num3;
        return sum;
    }
    double addNums(double num1,double num2,double num3) {
        double sum = num1 + num2 + num3;
        return sum;
    }
    public static void main(String[] args) {

        overloadingExample overloads = new overloadingExample();
        System.out.println("Sum of integers :"+overloads.addNums(23,17,12));
        System.out.println("Sum of floats :"+overloads.addNums(43.7,23.9,343.9));
        System.out.println("Sum of doubles :"+ overloads.addNums(23456,89463,32242));
        }
    /**
     * Polymorphism in Java is a concept by which we can perform a single action in different ways. ...
     * So polymorphism means many forms. There are two types of polymorphism in Java: compile-time polymorphism
     * and runtime polymorphism.
     * We can perform polymorphism in java by method overloading and method overriding.
     *
     *
     *
     * Method Overloading is a feature that allows a class to have more than one method having the same name,
     * if their argument lists are different. It is similar to constructor overloading in Java,
     * that allows a class to have more than one constructor having different argument lists.
     */

}

