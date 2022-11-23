import java.io.*;
public class ConsoleInput{
   public static void main(String[] args){
   	System.out.println("=============Method 3 to take dynamic input using Console===============");
        Console c = System.console();
        String uname = c.readLine("User Name: ");// c.readLine() show the String & take input as the form of "String" from console
        char[] pwd = c.readPassword("Password: ");//c.readPassword() show the String & take input as the form of "char[]" from console
        String upwd = new String(pwd); // char[] --> String
        if(uname.equals("mohacel") && upwd.equals("740325")){
            System.out.println("Login Success");
        }else{
            System.out.println("User Name or Password is incorrect ");
        }
   }
}