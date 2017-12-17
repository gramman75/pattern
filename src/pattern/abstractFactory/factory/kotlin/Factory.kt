package pattern.abstractFactory.factory.kotlin

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory?{
            var factory: Factory? = null
            try {
                factory = Class.forName(className).getDeclaredConstructor().newInstance() as Factory

            } catch (e: ClassNotFoundException){
                e.printStackTrace()
            }

            return factory

        }
    }

    abstract fun createLink(caption: String, url: String): Item
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}