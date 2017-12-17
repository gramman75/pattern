package pattern.abstractFactory.listFactory.java;

import pattern.abstractFactory.factory.java.Factory;
import pattern.abstractFactory.factory.java.Link;
import pattern.abstractFactory.factory.java.Page;
import pattern.abstractFactory.factory.java.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
