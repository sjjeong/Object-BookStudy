package obj01

class Bag(
    private val invitation: Invitation? = null,
    private var amount: Long
) {
    var ticket: Ticket? = null
        private set

    val hasInvitation: Boolean
        get() = invitation != null

    val hasTicket: Boolean
        get() = ticket != null

    fun hold(ticket: Ticket): Long {
        this.ticket = ticket
        return if (hasInvitation) {
            0L
        } else {
            ticket.fee.also(::minusAmount)
        }
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }
}