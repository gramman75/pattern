package pattern.interpreter.java;

import java.util.StringTokenizer;

public class Context {
    private String currentToken;
    private StringTokenizer token;

    public Context(String text){
        token = new StringTokenizer(text);
        nextToken();
    }
    public String nextToken(){
        if (token.hasMoreTokens()){
            this.currentToken = token.nextToken();
        }

        return this.currentToken;
    };

    public String currentToken(){
        return this.currentToken;
    };

    public void skipToken(String token) throws ParseException{
        if (this.currentToken.equals(token)){
            nextToken();
        } else {
            throw new ParseException("Warning :" + token +" is expected");
        }
    };

    public int currentNumber() throws ParseException{
        int number = 0;
        try{
            number = Integer.parseInt(this.currentToken);
        } catch (NumberFormatException e){
            throw new ParseException("Warning : " + e.getMessage());
        }

        return number;
    }


}
