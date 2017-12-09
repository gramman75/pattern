package pattern.factory.java;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList<String>();

    @Override
    protected Product createProduct(String name) {
        return new IDCard(name);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add( ((IDCard)product).getOwner());
    }

    public List getOwners(){
        return owners;
    }
}
