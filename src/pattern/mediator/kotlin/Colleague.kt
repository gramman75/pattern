package pattern.mediator.kotlin

interface Colleague{
    fun setMediator(mediator: Mediator)
    fun setColleagueEnabled(enabled: Boolean)
}