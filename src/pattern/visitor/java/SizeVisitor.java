package pattern.visitor.java;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int totalSize = 0;

    @Override
    void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    void visit(Directory dir) {
        Iterator it = dir.iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }

    public int getSize(){
        return this.totalSize;
    }
}
