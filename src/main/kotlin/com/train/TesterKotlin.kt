package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)

    while (true) {
        print("Please enter number of tickets: ")
        var totalTicket = scanner.nextInt();

        if (totalTicket == -1) break

        print("How many round-trip tickets: ")
        var roundTicket = scanner.nextInt()

        var trainTicket = Train()
        trainTicket.TotalTickets(totalTicket, roundTicket)

    }
}

class Train() {
    fun TotalTickets(totalTicket: Int, roundTicket: Int): Int {
        var ticketFare = ((totalTicket - roundTicket) * 1000
                + (roundTicket * 2000) * 0.9);
        println("Total ticket: $totalTicket")
        println("Round-trip: $roundTicket")
        println("Total: ${ticketFare.toInt()}\n")
        return ticketFare.toInt()
    }
}