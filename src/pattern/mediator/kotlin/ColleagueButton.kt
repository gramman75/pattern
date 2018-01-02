package pattern.mediator.kotlin

import java.awt.Button

class ColleagueButton(title: String): Button(title), Colleague{
    lateinit var _mediator: Mediator



    override fun setMediator(mediator: Mediator) {
        this._mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}