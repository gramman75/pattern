package pattern.proxy.java;

public class Main {
    public static void main(String[] args) {
        Printable print = new PrinterProxy("Kim");
        System.out.println(print.getPrinterName());
        print.setPrinterName("Lee");
        print.print("Hello");
    }
}
