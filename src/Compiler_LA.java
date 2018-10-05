import java.io.File;
import java.util.Scanner;

public class Compiler_LA {

    public static enum Type {
        IDENTIFIER, KEYWORD, INTEGER, REAL, OPERATOR, SEPARATOR;
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

        //switch case for keywords
        switch(lexeme){
            case "whileend":
                return new Token(Type.KEYWORD, lexeme);
            case "whileend":
                return new Token(Type.KEYWORD, lexeme);
            case "if":
                return new Token(Type.KEYWORD, lexeme);
            case "ifend":
                return new Token(Type.KEYWORD, lexeme);
            case "do":
                return new Token(Type.KEYWORD, lexeme);
            case "function":
                return new Token(Type.KEYWORD, lexeme);
            case "$$":
                return new Token(Type.KEYWORD, lexeme);
        }

        //switch case for separators
        switch(lexeme){
            case "(":
                return new Token(Type.KEYWORD, lexeme);
            case ")":
                return new Token(Type.KEYWORD, lexeme);
            case ",":
                return new Token(Type.KEYWORD, lexeme);
            case ";":
                return new Token(Type.KEYWORD, lexeme);
            case "{":
                return new Token(Type.KEYWORD, lexeme);
            case "}":
                return new Token(Type.KEYWORD, lexeme);
            case "[":
                return new Token(Type.KEYWORD, lexeme);
            case "]":
                return new Token(Type.KEYWORD, lexeme);
            case ".":
                return new Token(Type.KEYWORD, lexeme);
        }
        //switch case for operators
        switch(lexeme){
            case "=":
                return new Token(Type.KEYWORD, lexeme);
            case "+":
                return new Token(Type.KEYWORD, lexeme);
            case "-":
                return new Token(Type.KEYWORD, lexeme);
            case "/":
                return new Token(Type.KEYWORD, lexeme);
            case "*":
                return new Token(Type.KEYWORD, lexeme);
            case ">":
                return new Token(Type.KEYWORD, lexeme);
            case "<":
                return new Token(Type.KEYWORD, lexeme);
            case "|":
                return new Token(Type.KEYWORD, lexeme);
        }


        for(int i = 0; i < token.length; i++) {
            switch (token.charAt(i)) {

            }


        }
        return new Token(Type.KEYWORD, lexeme);
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
