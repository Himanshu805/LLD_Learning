package DesignQuestions.DesignTictacToe2.Models;

import java.util.Set;

public class Symbol {

    char symbol;
    Set<Character> symbolSet;

    public Symbol(char x) {
        symbol = x;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
