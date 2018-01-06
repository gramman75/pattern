package pattern.interpreter.java;

public class ProgramNode extends Node {
    CommandListNode commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[Program]" + commandListNode + "]";
    }
}
