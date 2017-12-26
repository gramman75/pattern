package pattern.visitor.java;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    ArrayList<File> files = new ArrayList();
    String searchStr;

    public FileFindVisitor(String searchStr){
        this.searchStr = searchStr;
    }

    public Iterator getFoundFiles(){
        return this.files.iterator();
    }
    @Override
    void visit(File file) {
        if (file.getName().indexOf(this.searchStr) != -1)
            files.add(file);


    }

    void visit(Directory dir){
        Iterator it = dir.iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
