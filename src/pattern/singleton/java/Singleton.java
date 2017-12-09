package pattern.singleton.java;

public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        System.out.println("Create Instance");
    }


}
