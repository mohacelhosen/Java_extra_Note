import java.io.*;
import java.util.Scanner;

public class Take_Pwd_Without_Showing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String uname=null;
        String upwd=null;
        try{
            System.out.print("User Name: ");
            uname=input.next();
            upwd = String.valueOf(System.console().readPassword("Password: "));
        }catch (NullPointerException E){
            System.out.print("Password: ");
            upwd=input.next();
        }finally {
            if(uname.equals("mohacel") && upwd.equals("740325")){
                System.out.println("Login Successful");
            }else {
                System.out.println("Invalid User Name or Password");
            }
        }
    }
}