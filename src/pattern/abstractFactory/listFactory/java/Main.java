package pattern.abstractFactory.listFactory.java;

import pattern.abstractFactory.factory.java.Factory;
import pattern.abstractFactory.factory.java.Link;
import pattern.abstractFactory.factory.java.Page;
import pattern.abstractFactory.factory.java.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("pattern.abstractFactory.listFactory.java.ListFactory");

        Link link1 = factory.createLink("Daum", "http://www.daum.net");
        Link link2 = factory.createLink("Google", "http://www.google.com");
        Tray tray1 = factory.createTray("Search Site");
        tray1.add(link1);
        tray1.add(link2);

        Link link3 = factory.createLink("NY Times", "http://www.nytimes.com");
        Link link4 = factory.createLink("한겨레", "http://www.hani.co.kr");

        Tray tray2 = factory.createTray("News");
        tray2.add(link3);
        tray2.add(link4);

        Page page = factory.createPage("Link Site", "gramman75");
        page.add(tray1);
        page.add(tray2);

        page.output();
    }
}
