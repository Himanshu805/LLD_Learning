package DesignQuestions.DesignTictacToe2.Models;

import java.util.Scanner;

public class Human extends Player {

    private int level;

    public Human(String name, PlayerType type, Symbol symbol, int level) {
        super(name, type, symbol);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the row : ");
        int row = sc.nextInt();
        System.out.println("please enter the column : ");
        int column = sc.nextInt();

        Cell cell = new Cell(row,column);

        return new Move(cell,this);

    }
}


