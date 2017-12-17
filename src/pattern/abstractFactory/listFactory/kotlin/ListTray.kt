package pattern.abstractFactory.listFactory.kotlin

import pattern.abstractFactory.factory.kotlin.Tray

class ListTray(caption: String): Tray(caption) {
    override fun makeHTML(): String{

        val buffer = StringBuffer()

        buffer.append("<li>\n")
        buffer.append(this.caption + "\n")
        buffer.append("<ul>\n")
        for (it in this.tray) {
            buffer.append(it.makeHTML())
        }

        buffer.append("</ul>\n")

        return buffer.toString()

    }
}