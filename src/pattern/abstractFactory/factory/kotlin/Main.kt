package pattern.abstractFactory.factory.kotlin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            val factory = Factory.getFactory("ListFactory")
            if (factory != null){
                val daum = factory.createLink("Daum", "http://www.daun.net")
                val naver = factory.createLink("Naver", "http://www.naver.com")
                val nytimes = factory.createLink("NYTimes", "http://www.nytimes.com")
                val hani = factory.createLink("Hani","http://www.hani.co.kr")

                var portal = factory.createTray("Portal")
                portal.add(daum);
                portal.add(naver);

                var news = factory.createTray("News Pager")
                news.add(nytimes)
                news.add(hani)

                var page = factory.createPage("Link Site", "gramman75")
                page.output()
            }
        }
    }
}