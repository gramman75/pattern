package pattern.abstractFactory.factory.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content;

    public Page(String title, String author){
        this.title = title;
        this.author = author;
        content = new ArrayList<Item>();
    }

    public void add(Item item){
        this.content.add(item);
    }

    public abstract String makeHTML();
    public void output(){
        try{
            String filename = this.title+".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename+"을 작성하였습니다.");
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }


}
