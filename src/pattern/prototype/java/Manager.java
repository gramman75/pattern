package pattern.prototype.java;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap();

    public void register(String name, Product pro){
        showcase.put(name, pro);
    }

    public Product create(String name){
        Product prop = showcase.get(name);
        return prop.createClone();
    }


}
