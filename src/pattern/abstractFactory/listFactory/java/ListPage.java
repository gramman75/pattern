package pattern.abstractFactory.listFactory.java;

import pattern.abstractFactory.factory.java.Item;
import pattern.abstractFactory.factory.java.Page;

public class ListPage extends Page {
    public ListPage(String title, String author){
        super(title, author);
    }

    @Override
    public String makeHTML(){
        StringBuffer buffer = new StringBuffer();

        buffer.append("<html>\n");
        buffer.append("<head><title>"+this.title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<p>" + this.author + "</p>");
        for (Item it :
                this.content) {
            buffer.append(it.makeHTML());
        }

        buffer.append("</body>\n");
        buffer.append("</html>");


        return buffer.toString();
    }

}
