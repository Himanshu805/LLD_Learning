package DesignQuestions.DesignTictacToe;

public class Board {

    int size;
    PlayerPiece[][] board;
    public Board(int size){
        this.size = size;
        board = new PlayerPiece[size][size];
    }
}
