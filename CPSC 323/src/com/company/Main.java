package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Evan Purpura\\OneDrive\\Documents\\Fall '18\\Compilers\\compiler-CPSC323\\CPSC 323\\src\\com\\company\\test.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String lexeme = input.next();
            Token temp = new Token(lexeme);
            System.out.println(lexeme);
        }
    }
}
