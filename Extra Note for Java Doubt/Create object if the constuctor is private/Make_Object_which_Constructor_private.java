public class Make_Object_which_Constructor_private {
    String name="Mohacel";
    int id=1002;
    private Make_Object_which_Constructor_private() {
        System.out.println("Private Constructor");
    }
//    create obj using static method.
//    private are allow  only within the class so, we create object by static method
//    it can call by className
    public static void createObj(){
        Make_Object_which_Constructor_private obj = new Make_Object_which_Constructor_private();
        obj.displayInfo();
    }
    public void displayInfo(){
        System.out.println(name+", your id "+id);
    }

//    another way to create object using static block, it will execute before the main method
    static {
    System.out.print("Static block: ");
        Make_Object_which_Constructor_private obj = new Make_Object_which_Constructor_private();
    }
}
