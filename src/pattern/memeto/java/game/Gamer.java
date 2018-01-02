package pattern.memeto.java.game;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

public class Gamer {
    private int money = 0;
    private ArrayList<String> fruits = new ArrayList<String>();
    private Random rand = new Random();

    private static String[] fruitsname = {
            "사과", "포도", "배", "바나나"
    };

    public Gamer(int money){
        this.money = money;
    }
    public int getMoney(){
        return this.money;
    }

    public Memento createMemento(){
        Memento m = new Memento(this.money);

        m.money = this.money;
        for (String fruit :
                this.fruits) {
            if (fruit.startsWith("맛있는"))
                m.addFruit(fruit);
        }

        return m;
    }

    public void restoreMemento(Memento memento){
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    private String getFruit(){
        String prefix = "";
        if (rand.nextBoolean())
            prefix = "맛있는 ";

        return prefix + fruitsname[rand.nextInt(fruitsname.length)];
    }

    @Override
    public String toString() {
        return "[Money : " + this.money +", fruits: "+fruits + "]";
    }

    public void bet(){
        int dice = rand.nextInt(6) + 1;
        if (dice == 1){
            this.money += 100;
            System.out.println("소지금이 증가되었습니다.");
        } else if (dice == 2){
            this.money /= 2;
            System.out.println("소지금이 절반이 되었습니다.");
        } else if (dice == 6){
            String f = this.getFruit();
            this.fruits.add(f);
            System.out.println("과일("+f+")를 받았습니다.");
        } else{
            System.out.println("변화가 없습니다.");
        }
    }
}
