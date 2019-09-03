public class practiseMethods {

    void justoData(){
        System.out.println("I am a method that does not return anything");
    }
    String justoText(){
        String txt = "I am a method that has an argument";
        return txt;
    }
    int addNums (int num1,int num2,int num3){
        int sum = num1+ num2 + num3;
        return sum;
    }

    public static void main(String[] args) {
        //methods must be declared within a clas. here,class is practisemethods
        //creating methpods now...
        //as shown below,the name od the methods is justoData
        practiseMethods showResults = new practiseMethods();
        showResults.justoData();
        System.out.println("The sum is :"+ showResults.addNums(12,23,34));



    }
}
