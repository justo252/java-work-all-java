public class usingContinue {
    public static void main(String[] args) {
        for (int num1=1;num1<=10;num1++){
            if (num1==2 || num1==5 || num1==7 || num1==9)
            {
                continue;
            }
            System.out.println("The count is :"+num1);
        }
    }
}
