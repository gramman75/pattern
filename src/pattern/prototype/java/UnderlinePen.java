package pattern.prototype.java;

public class UnderlinePen implements Product{
    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    public void use(String s){
        int length = s.length();
        System.out.println(s);
        for (int i = 0; i < length; i++) {
            System.out.print(this.ulchar);
        }
        System.out.println();
    }

    public Product createClone(){
        Product p = null;

        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
