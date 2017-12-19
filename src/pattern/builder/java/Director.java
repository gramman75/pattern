package pattern.builder.java;

import java.util.ArrayList;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        this.builder.makeTitle("Title");
        this.builder.makeString("Sub Title");
        this.builder.makeItem(new String[]{
                "Item1","Item2","Item3"
        });
        this.builder.close();
    }

}
