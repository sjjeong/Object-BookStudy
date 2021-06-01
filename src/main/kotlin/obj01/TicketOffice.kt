package obj01

class TicketOffice(private var amount: Long, vararg tickets: Ticket) {
    private val tickets: List<Ticket> = tickets.toList()

    private val ticket: Ticket?
        get() = tickets.getOrNull(0)

    fun sellTicketTo(audience: Audience) {
        val ticket = ticket ?: return
        plusAmount(audience.buy(ticket))
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

}