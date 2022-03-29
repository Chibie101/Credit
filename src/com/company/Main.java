package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your card #?:");
        long card = input.nextLong();
        long c = card;
        int other_total = 0;
        int total = 0;
        int total_total = 0;
        long remove = card;
        int mod;
        int mod2;
        int dig, dig2;
        long first = card;

        int i = 0;
        while (c > 0) {
            c = c / 10;
            i++;
        }

        if (i != 13 && i != 15 && i != 16) {
            System.out.println("INVALID");
        }
        while (remove > 0) {
            mod = (int) (remove % 10);
            remove = remove / 10;
            other_total = other_total + mod;

            mod2 = (int) (remove % 10);
            remove = remove / 10;

            mod2 = mod2 * 2;
            dig = mod2 % 10;
            dig2 = mod2 / 10;
            total = total + dig + dig2;
        }
        total_total = other_total + total;
        if (total_total % 10 != 0) {
            System.out.println("INVALID");
        }
        while (first > 100)
        {
            first = first / 10;
        }
        if ((first / 10 == 5) && first %10 > 0 && first % 10 < 6)
        {
            System.out.println("MASTERCARD");
        }
        else if ((first / 10 == 3) && first % 10 == 4 || first % 10 == 7)
        {
            System.out.println("AMEX");
        }
        else if (first / 10 == 4)
        {
            System.out.println("VISA");
        }
        else {
            System.out.print("INVALID");
        }
    }

    }