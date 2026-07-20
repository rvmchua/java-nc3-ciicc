package com.ciicc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        byte length = input.nextByte();
        String[] colors = new String[length];

        for (int index = 0; index < colors.length; index++) {
            System.out.print("Enter color: ");
            colors[index] = input.next();
        }

        input.close();
        System.out.println(Arrays.toString(colors));
    }
}