package com.chapter1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.print("Hey who are you!");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());

        System.out.print("Enter any number : ");
        Scanner inputInt = new Scanner(System.in);
        System.out.println(inputInt.nextInt());


        System.out.println("Hey what's your full name!");
        Scanner inputFullName = new Scanner(System.in);
        System.out.println(inputFullName.nextLine());
    }
}
