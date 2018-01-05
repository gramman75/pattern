package pattern.proxy.java;

interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String msg);
}
