package com.chapter2;

import java.util.Scanner;

public class HowInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
    }
}
