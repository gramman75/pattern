package pattern.abstractFactory.listFactory.kotlin

import pattern.abstractFactory.factory.kotlin.Link

class ListLink(caption: String, url: String): Link(caption, url) {
    override fun makeHTML(): String {
        return "<a href='${this.url}'>${this.caption}</a>"
    }
}