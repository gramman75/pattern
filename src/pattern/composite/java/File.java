package pattern.composite.java;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this.getName() );
    }
}
