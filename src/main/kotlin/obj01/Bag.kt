package obj01

class Bag(
    private val invitation: Invitation? = null,
    private var amount: Long
) {
    var ticket: Ticket? = null

    val hasInvitation: Boolean
        get() = invitation != null

    val hasTicket: Boolean
        get() = ticket != null

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}