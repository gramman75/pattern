package pattern.singleton.kotlin


object TicketMaker{
    private var ticket: Int = 1000

    fun getNextTicketNumber(): Int{
        return this.ticket++
    }
}