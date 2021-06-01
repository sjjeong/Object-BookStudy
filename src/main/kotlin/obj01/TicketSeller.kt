package obj01

class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        val ticket = ticketOffice.ticket ?: return
        val fee = audience.buy(ticket)
        ticketOffice.plusAmount(fee)
    }
}