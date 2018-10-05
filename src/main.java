import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

public class main {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("test.txt");
       // BufferedReader br = new BufferedReader(new Filereader("input.txt"));

       // String line = br.readLine();
        File file = new File("test.txt");

        Scanner input = new Scanner(file);

        String lexeme = "", preLexeme = "", postLexeme = "";
        boolean isComment = false;
        int commStart, commEnd;


        Compiler_LA compiler = new Compiler_LA();
        Compiler_LA.Token thisToken;

        //compiler.removeComments(input);
        while(input.hasNext()){
            lexeme = input.next();
            System.out.println(lexeme);

            //ignore comments comments
            if(lexeme.contains("[*")) {
                commStart = lexeme.indexOf("[*"); //index might be off
                preLexeme = lexeme.substring(0, commStart);
                isComment = true;
                while(isComment) {
                    if (lexeme.contains("*]")) {
                        commEnd = lexeme.indexOf("*]"); //index might be off
                        lexeme = lexeme.substring(commEnd, lexeme.length() - 1);
                        isComment = false;
                    }
                    else{
                        while(input.hasNext()){
                            lexeme = input.next();
                        }
                    }
                }

                if(!preLexeme.isEmpty()) {
                    thisToken = compiler.lexer(preLexeme);
                    preLexeme = "";
                    System.out.println(thisToken);
                }
            }

            thisToken = compiler.lexer(lexeme);

            System.out.println(thisToken);
        }
    }

}
