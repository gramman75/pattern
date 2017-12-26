package pattern.CoR.java;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name){
        this.name = name;
    }

    public Support setNext(Support support){
        this.next = support;
        return support;
    }

    public void support(Trouble trouble){
        if (resolve(trouble)){
            System.out.println(trouble +"은 " + this.name +"에 의해서 해결되었습니다.");
        } else if (next != null){
            this.next.support(trouble);
        } else {
            System.out.println((trouble +"은 해결되지 못했습니다."));
        }

    }

    protected abstract boolean resolve(Trouble trouble);

}
