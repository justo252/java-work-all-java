public class usingSwitch {
    public static void main(String[] args) {
        char choice = 'D';
        switch (choice){
            case 'A':
                System.out.println("Apples");
                break;

                case 'B':
                    System.out.println("Bananas");
                    break;

                    case 'C':
                        System.out.println("Mangoes");
                        break;
            case 'D':
                System.out.println("Mangoes");
                break;

                default:
                    System.out.println("Invalid Choice");
                    break;
        }
    }
}
