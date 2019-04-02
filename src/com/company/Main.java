package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);
        int t1 = 1, t2 = 1;
        System.out.print("Masukan angka : ");
        int n = scnr.nextInt();

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
