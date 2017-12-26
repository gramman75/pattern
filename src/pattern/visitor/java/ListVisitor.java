package pattern.visitor.java;


import java.util.Iterator;

public class ListVisitor extends Visitor {
    String currentDir ="" ;
    public void visit(File file){
        System.out.println(this.currentDir+"/"+file);
    }

    @Override
    void visit(Directory dir) {
        System.out.println(currentDir+"/"+dir);
        String savedir = currentDir;
        currentDir = currentDir + "/" + dir.getName();

        Iterator it = dir.iterator();
        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }

        currentDir = savedir;
    }
}
