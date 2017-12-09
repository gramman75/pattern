package pattern.factory.java;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product p1 = factory.create("Kim");
        Product p2 = factory.create("Lee");

        p1.use();
        p2.use();

        List owners = ((IDCardFactory)factory).getOwners();

        for (Object owner :
                owners) {
            System.out.println(owner);
        }
    }
}
