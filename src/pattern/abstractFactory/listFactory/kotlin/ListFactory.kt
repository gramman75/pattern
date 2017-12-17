package pattern.abstractFactory.listFactory.kotlin

import pattern.abstractFactory.factory.kotlin.Factory
import pattern.abstractFactory.factory.kotlin.Item
import pattern.abstractFactory.factory.kotlin.Page
import pattern.abstractFactory.factory.kotlin.Tray

class ListFactory: Factory() {
    override fun createLink(caption: String, url: String): Item {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }


}