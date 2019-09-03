public class practiseUsingSwitch {
    public static void main(String[] args) {

        char choice = 'A';
        switch (choice){
            case 'A' :
                System.out.println("Excellent!");
                break;

            case 'B':
            case 'C':
                System.out.println("Well Done");
                break;

            case 'D':
                System.out.println("You almost Failed");

            case 'E':
                System.out.println("Sorry,You failed");
                break;

                default:
                    System.out.println("Invalid input");
        }
        System.out.println("Your Grade is   :" + choice);

    }
}
