package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String lexeme  = input.next();
            System.out.println(lexeme);
        }
    }
}
