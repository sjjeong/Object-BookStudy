package obj01

class Theater(private val ticketSeller: TicketSeller) {

    fun enter(audience: Audience) {
        val ticket = ticketSeller.ticketOffice.ticket ?: return
        if (audience.bag.hasInvitation) {
            audience.bag.ticket = ticket
        } else {
            val fee = ticket.fee
            audience.bag.minusAmount(fee)
            audience.bag.ticket = ticket
            ticketSeller.ticketOffice.plusAmount(fee)
        }
    }
}