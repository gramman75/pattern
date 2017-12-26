package pattern.visitor.java;

import pattern.visitor.java.Directory;
import pattern.visitor.java.Entry;
import pattern.visitor.java.File;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Directory rootDirectory = new Directory("root");
        Entry firstDic = new Directory("firstdir");
        Entry secondDic = new Directory("seconddir");

        firstDic.add(new File("file1",100));
        firstDic.add(new File("file2",200));
        secondDic.add(new File("file3",200));
        secondDic.add(new File("file4",200));

        rootDirectory.add(firstDic);
        rootDirectory.add(secondDic);

        rootDirectory.accept(new ListVisitor()) ;

        FileFindVisitor ffv = new FileFindVisitor("file2");
        rootDirectory.accept(ffv);
        Iterator it = ffv.getFoundFiles();

        while (it.hasNext()){
            Entry entry = (Entry)it.next();
            System.out.println(entry);

        }





    }
}
