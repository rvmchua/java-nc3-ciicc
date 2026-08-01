package com.ciicc.augustone;

import java.util.Scanner;

public class ExceptTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Pick a number between 1 and 3: ");
            int number = input.nextInt();
            System.out.println(numbers[number-1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}