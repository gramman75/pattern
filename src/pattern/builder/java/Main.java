package pattern.builder.java;

public class Main{
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();

        Director textDirector = new Director(textBuilder);

        textDirector.construct();

        System.out.println(textBuilder.getResult());

    }
}
