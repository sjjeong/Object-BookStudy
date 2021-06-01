package obj01

class TicketOffice(private var amount: Long, vararg tickets: Ticket) {
    private val tickets: List<Ticket> = tickets.toList()

    val ticket: Ticket?
        get() = tickets.getOrNull(0)

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

}