package pattern.builder.java;

public class TextBuilder extends Builder {

    StringBuffer buffer = new StringBuffer();
    @Override
    public void makeTitle(String s){
        buffer.append(s+"\n");

//        System.out.println(s);
    }

    @Override
    public void makeString(String s) {
        buffer.append("    " + s+"\n");
//        System.out.println("    "+ s);

    }

    @Override
    public void makeItem(String[] items) {
        for (String item  : items) {
            buffer.append("     ㅇ " + item +"\n");
//            System.out.println("     ㅇ " + item);
        }
    }

    @Override
    public void close() {
        buffer.append("======================\n");
//        System.out.println("======================");

    }

    public String getResult(){
        return buffer.toString();
    }
}
