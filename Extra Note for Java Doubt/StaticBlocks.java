/**
 * Author: Mohacel Hosen
 * Topic: Static Blocks
 * Description: when JVM load the class file first it will execute every static blocks
 */

public class StaticBlocks {
    static{
        System.out.println("This is the first static blocks");
    }
    static{
        System.out.println("This is the Second static blocks");
    }
    public static void show(){
        System.out.println("This is a static method which you can call by className");
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        StaticBlocks.show();
    }
    static{
        System.out.println("This is the third static blocks");
    }
    static{
        System.out.println("This is the fourth static blocks");
    }
}
