package pattern.abstractFactory.listFactory.kotlin

import pattern.abstractFactory.factory.kotlin.Item
import pattern.abstractFactory.factory.kotlin.Page

class ListPage(title: String, author: String): Page(title, author) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<html>" +
                "<head><title>${this.title}</title></head>" +
                "<body>")

        for (item: Item in this.content){
            buffer.append(item.makeHTML())
        }

        buffer.append("</body></html>")

        return buffer.toString()

    }
}