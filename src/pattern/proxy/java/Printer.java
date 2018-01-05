package pattern.proxy.java;

public class Printer implements Printable {
    private String name;

    public Printer(String name){
        this.name = name;
        heavyJob("생성중");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String msg) {

        System.out.println("===" + this.name + "===");
        System.out.println(msg);
    }

    private void heavyJob(String msg){
        System.out.println(msg);
        for (int i=0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print(".");
        }

        System.out.println("완료");
    }
}
