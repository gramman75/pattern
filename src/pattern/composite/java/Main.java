package pattern.composite.java;

public class Main {
    public static void main(String[] args) {
        Entry rootDirectory = new Directory("root");
        Entry firstDic = new Directory("first");

        firstDic.add(new File("file",100));
        firstDic.add(new File("second",200));

        rootDirectory.add(firstDic);

        rootDirectory.printList();




    }
}
