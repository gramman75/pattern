package pattern.visitor.java;


import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;

     ArrayList<Entry> directory = new ArrayList<Entry>();

    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    int getSize() {
//        int totalSize  = 0;
//        for (Entry it :
//                this.directory) {
//            totalSize += it.getSize();
//        }
//
//        return totalSize;
        SizeVisitor sizeVisitor = new SizeVisitor();
        this.accept(sizeVisitor);

        return sizeVisitor.getSize();
    }

    public Iterator iterator(){
        return this.directory.iterator();
    }

    public Entry add(Entry entry){
        this.directory.add(entry);
        return entry;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
