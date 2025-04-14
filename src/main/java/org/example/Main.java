package org.example;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = read.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = read.nextInt();
        read.nextInt();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultipy");
        System.out.println("(D)ivide");


        System.out.print("Please select an option: ");
        char option = read.next().charAt(0);
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));






    }
}