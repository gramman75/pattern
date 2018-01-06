package pattern.interpreter.java;

import java.util.ArrayList;

public class CommandListNode extends Node {
    ArrayList<Node> list = new ArrayList<>();

    @Override
    public void parse(Context context) throws ParseException {
        while(true){
            if ( context.currentToken() == null){
                throw new ParseException("Missing Token");
            } else if (context.currentToken().equals("end")){
                context.skipToken("end");
                break;
            } else {
                CommandNode node = new CommandNode();
                node.parse(context);
                list.add(node);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
