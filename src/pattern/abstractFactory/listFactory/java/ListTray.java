package pattern.abstractFactory.listFactory.java;

import pattern.abstractFactory.factory.java.Item;
import pattern.abstractFactory.factory.java.Tray;

public class ListTray extends Tray {
    public ListTray(String caption){
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("<li>\n");
        buffer.append(this.caption+"\n");
        buffer.append("<ul>\n");
        for (Item it :
                this.tray) {
            buffer.append(it.makeHTML());
        }

        buffer.append("</ul>\n");

        return buffer.toString();
    }


}
