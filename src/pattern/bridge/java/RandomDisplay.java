package pattern.bridge.java;

import java.util.Random;

public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl){
        super(impl);
    }

    public void randomDisplay(int times){
        Random random = new Random();
        int cnt = random.nextInt(times+1);

        this.open();
        for(int i=0; i < cnt; i++){
            this.print();
        }
        this.close();


    }
}
