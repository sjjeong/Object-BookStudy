package obj01

class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        val ticket = ticketOffice.ticket ?: return
        if (audience.bag.hasInvitation) {
            audience.bag.ticket = ticket
        } else {
            val fee = ticket.fee
            audience.bag.minusAmount(fee)
            audience.bag.ticket = ticket
            ticketOffice.plusAmount(fee)
        }
    }
}