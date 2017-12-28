package pattern.mediator.kotlin

import java.awt.Button

class ColleagueButton(title: String): Button(title), Colleague{
    val mediator: Mediator

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }



}