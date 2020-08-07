package com.train

import java.util.*

fun main() {
    var scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var total_ticket = scanner.nextInt();
    print("How many round-trip tickets: ")
    var round_ticket = scanner.nextInt();

    var train_ticket = Train()
    train_ticket.TotalTickets(total_ticket, round_ticket)
}

class Train() {
    fun TotalTickets(total_ticket: Int, round_ticket: Int): Int {
        var ticketfare = ((total_ticket - round_ticket) * 1000
                + (round_ticket * 2000) * 0.9)
        println("Total ticket: $total_ticket")
        println("Round-trip: $round_ticket")
        println("Total: ${ticketfare.toInt()}")
        return ticketfare.toInt()
    }
}