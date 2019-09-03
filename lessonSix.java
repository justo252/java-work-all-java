public class lessonSix {
    public static void main(String[] args) {
        //Declaring and Initializing Variables for computations\

        int num1 = 35;
        int num2 = 24;
        int num3 = 12;

        //compound assignment operatots
        /*
        They initialize variables and perform computations at the same time.
        They Include: +=,-=,*=,/=,%=
        e.g a+=b is the same as a=a+b
        given that a=2 anmd b=3,find a.
        a=5


         */

        //computations/processiong

        num1+=num2;
        num2-=num1;
        num3*=num2;

        //results
        System.out.println("Result One      :"  + num1);
        System.out.println("Result Two      :"  + num2);
        System.out.println("Result Three    :"  + num3);

    }
}
