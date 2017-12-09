package pattern.factory.java;

import java.util.ArrayList;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }
    @Override
    void use() {
        System.out.println(this.owner);

    }
}
