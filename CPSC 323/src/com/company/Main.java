package com.company;

import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Evan Purpura\\OneDrive\\Documents\\Fall '18\\Compilers\\compiler-CPSC323\\CPSC 323\\src\\com\\company\\test.txt");
        Scanner input = new Scanner(file);
        BufferedWriter writer =  new BufferedWriter( new FileWriter("output.txt"));

        writer.write("Token");
        writer.write("        Lexeme");
        writer.newLine();

        while (input.hasNext()) {
            String lexeme = input.next();
            Token temp = new Token(lexeme);
            writer.write(temp.toString());
            writer.newLine();

        }
        writer.flush();
        writer.close();
    }
}
