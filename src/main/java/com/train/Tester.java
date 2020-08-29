package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter number of tickets: ");
            int total_ticket = scanner.nextInt();
            if(total_ticket == -1) break;

            System.out.print("How many round-trip tickets: ");
            int round_ticket = scanner.nextInt();
            float ticketfare = (total_ticket - round_ticket) * 1000
                    + (round_ticket * 2000) * 0.9f;

            System.out.println("Total tickets:\t" + total_ticket);
            System.out.println("Round-trip:\t" + round_ticket);
            System.out.println("Total\t" + (int) ticketfare + "\n");
        }
    }
}
