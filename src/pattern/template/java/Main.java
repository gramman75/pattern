package pattern.template.java;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay strDisp = new StringDisplay("Hello World");
        AbstractDisplay chrDisp = new CharDisplay('H');

        chrDisp.display();

        strDisp.display();
    }
}
