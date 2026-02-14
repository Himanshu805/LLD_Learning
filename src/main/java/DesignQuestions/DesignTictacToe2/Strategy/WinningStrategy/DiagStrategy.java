package DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy;

import DesignQuestions.DesignTictacToe2.Models.Board;
import DesignQuestions.DesignTictacToe2.Models.Cell;
import DesignQuestions.DesignTictacToe2.Models.Move;
import DesignQuestions.DesignTictacToe2.Models.Player;

import java.util.List;

public class DiagStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        Player player = move.getPlayer();
        int col = move.getCell().getCol();
        int row = move.getCell().getRow();

        List<List<Cell>> grid = board.getBoard();

        if ((row == 0 && col == 0) || (row == 0 && col == board.getSize() - 1) || (row == board.getSize() - 1 && col == 0) || (row == board.getSize() - 1 && col == board.getSize() - 1)) {

            if ((row == 0 && col == 0) || (row == board.getSize() - 1 && col == board.getSize() - 1)) {
                for (int i = 0; i < board.getSize(); i++) {
                    if (grid.get(i).get(i).getSymbol() != player.getSymbol()) {
                        return false;
                    }
                }
            } else {
                for (int i = 0; i < board.getSize(); i++) {

                    if (grid.get(i).get(grid.size()-1 - i).getSymbol() != player.getSymbol()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
