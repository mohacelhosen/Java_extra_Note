package JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=============Method 1 to take dynamic input using BufferedReader ===============");
        System.out.print("Enter your name: ");
        String name = br.readLine();// readLine() always read string. if we need primitive we need convert sting to primitive
        System.out.print("Enter the same name: ");
        int ascii = br.read();// read first character

        System.out.println(name+", ascii value of your first character = "+ascii+"["+(char)ascii+"]");



        System.out.println("=============Method 2 to take dynamic input using Scanner===============");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine(); // it will take whole line
        System.out.print("Enter your same name: ");
        String ShortName = sc.next(); // it will take only first word
        System.out.println(fullName+", we may call you "+ "[" +ShortName+ "]" );

    }
}
