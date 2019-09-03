public class methodsExample {
    //method must be declared within a class. here, the class is methodsExample
    //creating Methods
    //displayData is the name of the method below

    void displayData(){
        System.out.println("I am a method that does not return anything");
      }
        String displayText()
        {
        String txt ="I am a method that has an argument";
        return txt;
        }
        int addNums(int num1,int num2,int num3){
            int sum = num1+num2+num3;
            return sum;


        }

    public static void main(String[] args) {
        methodsExample showResults = new methodsExample();
        showResults.displayData();
        System.out.println(showResults.displayText());
        System.out.println("The sum is :" + showResults.addNums(23,17,15));

    }
}
