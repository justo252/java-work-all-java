public class overRidingTwo extends overRidingOne {
    public static void cofee(){
        System.out.println("Coffe is a stimulant that activates the mind");
    }
    public static void ugali(){
        System.out.println("Ugali is a stable food");
    }
    public static void main(String[] args) {
        ugali();
        githeri();
        nduma();
        cofee();
    }
}
//this is a child
//overiding-we did a public static on cofee here so it has overriden what was in the parent class

//polymophism is overloading and overriding,.those are the two types