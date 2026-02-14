package DesignQuestions.DesignTictacToe2.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.size = size;
        board = new ArrayList<>();
        initializeBoard(size);
    }

    private void initializeBoard(int size) {
        for(int i = 0; i < size; i++){
            List<Cell> cells = new ArrayList<>();
            for(int j = 0; j < size; j++) {
                cells.add(new Cell(i, j));
            }
            board.add(cells);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void displayBoard(){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Cell cell = board.get(i).get(j);
                if(cell.getCellState() == CellState.EMPTY ){
                    System.out.print("  _  ");
                }
                else{
                    System.out.print(" "+cell.getPlayer().getSymbol().symbol+" ");

                }

            }
            System.out.println();
        }
    }
}
