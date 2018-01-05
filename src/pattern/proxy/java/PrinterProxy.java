package pattern.proxy.java;

public class PrinterProxy implements Printable {
    private Printable real;
    private String name;

    public PrinterProxy(String name){
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null)
            real.setPrinterName(name);

        this.name  = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public synchronized void print(String msg) {
        if (real == null)
            this.real = new Printer(this.name);

            real.print(msg);
    }
}
