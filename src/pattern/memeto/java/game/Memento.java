package pattern.memeto.java.game;

import java.util.ArrayList;

public class Memento {
    int money = 0;
    ArrayList<String> fruits;

    Memento(int momey){
        this.money = momey;
        fruits = new ArrayList<>();
    }

    public int getMoney(){
        return this.money;
    }

    void addFruit(String fruit){
        this.fruits.add(fruit);
    }

    ArrayList<String> getFruits(){
        return (ArrayList<String>)this.fruits.clone();
    }

}
