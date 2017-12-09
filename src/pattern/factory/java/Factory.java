package pattern.factory.java;

public abstract class Factory {
    abstract Product createProduct(String name);
    abstract void registerProduct(Product product);

    public final Product create(String name){
        Product product = this.createProduct(name);
        this.registerProduct(product);

        return product;
    }
}
