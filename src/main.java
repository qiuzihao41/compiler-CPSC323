import java.util.Scanner;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        Scanner input = new Scanner(file);

        String lexeme;
        Compiler_LA compiler = new Compiler_LA();

        while(input.hasNext()){

            lexeme = input.next();
            System.out.println(lexeme);
            compiler.lexer(lexeme);
        }
    }

}
