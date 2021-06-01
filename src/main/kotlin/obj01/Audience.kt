package obj01

class Audience(private val bag: Bag) {
    fun buy(ticket: Ticket): Long {
        bag.ticket = ticket
        return if (bag.hasInvitation) {
            0L
        } else {
            ticket.fee.also(bag::minusAmount)
        }
    }
}