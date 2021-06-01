package obj01

class Audience(private val bag: Bag) {
    fun buy(ticket: Ticket) = bag.hold(ticket)
}