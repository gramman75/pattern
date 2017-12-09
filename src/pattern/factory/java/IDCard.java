package pattern.factory.java;

import java.util.ArrayList;

public class IDCard extends Product {
    private String owner;

    // Private으로 생성자를 만들어서 Factory를 통하지 않고는
    // Instance를 만들지 못하도록 함.
    IDCard(String owner){
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
