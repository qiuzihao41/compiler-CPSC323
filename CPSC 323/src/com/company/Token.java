package com.company;

import java.lang.String;

public class Token {

    public String token;
    public String lexeme;

    public Token(String lexeme) {
        this.lexeme = lexeme;
        this.token = lexer();
    }

    public String lexer() {

        token = "token2134";

        switch (lexeme){
            case ("while"): {
                return "keyword";
            }
            case ("for"):{
                return "keyword";
            }
            case ("do"): {
                return "keyword";
            }
            case ("endwhile"): {
                return "keyword";
            }
            case ("if"): {
                return "keyword";
            }
            case ("else"): {
                return "keyword";
            }
            case ("ifend"):{
                return "keyword";
            }
            case ("return"):{
                return "keyword";
            }
            case ("get"):{
                return "keyword";
            }
            case ("put"):{
                return "keyword";
            }
            case ("int"):{
                return "keyword";
            }
            case ("double"):{
                return "keyword";
            }
            case ("long"):{
                return "keyword";
            }
            case ("true"):{
                return "keyword";
            }
            case ("false"):{
                return "keyword";
            }
            case ("String"):{
                return "keyword";
            }
            case ("function"):{
                return "keyword";
            }
            case ("elseif"):{
                return "keyword";
            }
            case ("[*"): {
                return "keyword";
            }
            case ("*]"):{
                return "keyword";
            }
            case ("("):{
                return "separator";
            }
            case (")"):{
                return "separator";
            }
            case ("{"):{
                return "separator";
            }
            case ("}"):{
                return "separator";
            }
            case ("["):{
                return "separator";
            }
            case ("]"):{
                return "separator";
            }
            default: {
                return "none";
            }
        }
    }

    @Override
    public  String toString(){
        String output = token + "    " + lexeme;

        return output;
    }
}