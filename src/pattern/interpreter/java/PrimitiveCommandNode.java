package pattern.interpreter.java;

public class PrimitiveCommandNode extends Node {
    String name;

    @Override
    public void parse(Context context) throws ParseException {
        this.name = context.currentToken();
        context.skipToken(this.name);

        if (!this.name.equals("go") &&
                !this.name.equals("right") &&
                !this.name.equals("left")){
            throw new ParseException(this.name + "is undefined");
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
