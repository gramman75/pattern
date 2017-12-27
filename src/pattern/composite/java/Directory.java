package pattern.composite.java;

import java.util.ArrayList;

public class Directory extends Entry {
    private String name;

    private ArrayList<Entry> directory = new ArrayList<Entry>();

    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    int getSize() {
        int totalSize  = 0;
        for (Entry it :
                this.directory) {
            totalSize += it.getSize();
        }

        return totalSize;
    }

    public Entry add(Entry entry){
        this.directory.add(entry);
        return entry;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);

        for (Entry it: this.directory){
            it.printList(prefix+"/"+this.name);
        }
    }
}
