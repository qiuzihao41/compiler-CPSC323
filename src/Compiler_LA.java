import java.io.File;
import java.util.Scanner;

public class Compiler_LA {

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
    }

    public Token lexer(String lexeme){

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

   /* public Scanner removeComments(Scanner input){
        String lexeme;
        boolean comment = false;
        while(input.hasNext()){
            lexeme = input.next();
            if (lexeme == "[*"){
                comment = true;
            }

            if(comment){

            }

        }


            return file;
    }
*/
}
