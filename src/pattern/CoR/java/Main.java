package pattern.CoR.java;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        NoSupport no = new NoSupport("NoSupport");
        LimitSupport limit = new LimitSupport("LimitSupport", 40);
        OddSupport  odd = new OddSupport("OddSupport ");
        SpecialSupport special = new SpecialSupport("SpecialSupport", 67);

        no.setNext(limit).setNext(odd).setNext(special);

        for(int i=0; i < 10; i++){
            no.support(new Trouble(random.nextInt(100)));
        }

    }
}
