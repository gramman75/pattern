package pattern.memeto.java;

import pattern.memeto.java.game.*;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for(int i=0; i<50; i++){
            System.out.println(gamer);
            gamer.bet();

            if (gamer.getMoney() > memento.getMoney()){
                System.out.println("상태를 저장합니다.");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() /2){
                System.out.println("상태를 복원합니다.");
                gamer.restoreMemento(memento);
            }

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
