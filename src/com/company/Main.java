package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Scanner scnr = new Scanner(System.in);
        int t1 = 1, t2 = 1, t3 = 0, t4 = 2;
        System.out.print("Masukan angka : ");
        int n = scnr.nextInt();


        for (int i = 1; i <= n; ++i)
        {
            t3 = t1 + t2;
            t4 = t3 + t4;
        }

        System.out.print(t4);
    }
}
