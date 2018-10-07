import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.*;

public class Compiler_LA {

    //public static final String[] operators = {"=", "+", "-", "/", "*", ">", "<", "|" };
   // public ArrayList<String> opsInLexeme = new ArrayList<String>();

    public static enum Type {
        IDENTIFIER, KEYWORD, INTEGER, REAL, OPERATOR, SEPARATOR, INVALID;
    }

    public class Token{
        private Type token;
        private String  lexeme;

        Token(Type token, String lexeme){
            this.token = token;
            this.lexeme = lexeme;
        }

        public void setToken(Type token){
            this.token = token;
        }

        public void setLexeme(String lexeme){
            this.lexeme = lexeme;
        }

        @Override
        public String toString(){
            return token.toString() + "\t\t\t" + this.lexeme;
        }
    }

    public Token lexer(String lexeme){
        
        boolean isInteger(String lexeme){
        return str.matches("[\-]\d+|\d+");
    }
        boolean isRealNumber(String lexeme){
        return str.matches("[\-\d]\d+\.\d+|\d+\.\d+");
    }
        boolean isIdentifier(String lexeme){
        return str.matches("\b([A-Za-z][A-Za-z0-9_]*)\b");
    }
        
        //switch case for separators
        switch(lexeme){
            case "(":
                return new Token(Type.SEPARATOR, lexeme);
            case ")":
                return new Token(Type.SEPARATOR, lexeme);
            case ",":
                return new Token(Type.SEPARATOR, lexeme);
            case ";":
                return new Token(Type.SEPARATOR, lexeme);
            case "{":
                return new Token(Type.SEPARATOR, lexeme);
            case "}":
                return new Token(Type.SEPARATOR, lexeme);
            case "[":
                return new Token(Type.SEPARATOR, lexeme);
            case "]":
                return new Token(Type.SEPARATOR, lexeme);
            case ".":
                return new Token(Type.SEPARATOR, lexeme);
            case ":":
                return new Token(Type.SEPARATOR, lexeme);
        }

        //switch case for keywords
        switch(lexeme){
            case "while":
                return new Token(Type.KEYWORD, lexeme);
            case "whileend":
                return new Token(Type.KEYWORD, lexeme);
            case "if":
                return new Token(Type.KEYWORD, lexeme);
            case "else":
                return new Token(Type.KEYWORD, lexeme);
            case "ifend":
                return new Token(Type.KEYWORD, lexeme);
            case "do":
                return new Token(Type.KEYWORD, lexeme);
            case "function":
                return new Token(Type.KEYWORD, lexeme);
            case "$$":
                return new Token(Type.KEYWORD, lexeme);
            case "int":
                return new Token(Type.KEYWORD, lexeme);
            case "boolean":
                return new Token(Type.KEYWORD, lexeme);
            case "true":
                return new Token(Type.KEYWORD, lexeme);
            case "false":
                return new Token(Type.KEYWORD, lexeme);
            case "real":
                return new Token(Type.KEYWORD, lexeme);
            case "return":
                return new Token(Type.KEYWORD, lexeme);
            case "get":
                return new Token(Type.KEYWORD, lexeme);
            case "put":
                return new Token(Type.KEYWORD, lexeme);
        }

        //switch case for operators
        switch(lexeme){
            case "=":
                return new Token(Type.OPERATOR, lexeme);
            case "+":
                return new Token(Type.OPERATOR, lexeme);
            case "-":
                return new Token(Type.OPERATOR, lexeme);
            case "/":
                return new Token(Type.OPERATOR, lexeme);
            case "*":
                return new Token(Type.OPERATOR, lexeme);
            case ">":
                return new Token(Type.OPERATOR, lexeme);
            case "<":
                return new Token(Type.OPERATOR, lexeme);
            case "|":
                return new Token(Type.OPERATOR, lexeme);
        }

        //DOUBLE OPERATORS
        switch(lexeme) {
            case "=<":
                return new Token(Type.OPERATOR, lexeme);
            case "=>":
                return new Token(Type.OPERATOR, lexeme);
            case "^=":
                return new Token(Type.OPERATOR, lexeme);
            case "==":
                return new Token(Type.OPERATOR, lexeme);
        }

        return new Token(Type.INVALID, lexeme);
    }

    //move removal of comments here later on
   //public String[] removeComments(String lexeme) {
  //  return new String[] {preLexeme, lexeme, postLexeme};
  // }

}
