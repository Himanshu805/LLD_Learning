package DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy;

import DesignQuestions.DesignTictacToe2.Models.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowStrategy  implements WinningStrategy {
    private Map<Integer, HashMap<Character,  Integer> > rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // check row is present in map or not, if not then add the row in map
        if(!rowCounts.containsKey(row)){
            rowCounts.put(row, new HashMap<>());
        }
        HashMap<Character, Integer> counts = rowCounts.get(row);
        Player player = move.getPlayer();
        Symbol symbol = player.getSymbol();

        // update the symbol count in row
        counts.put(symbol.getSymbol(), counts.getOrDefault(symbol.getSymbol(),0) + 1);

        // check the winner
        return counts.get(symbol.getSymbol()) == board.getSize();





//        Player player = move.getPlayer();
//        int row = move.getCell().getRow();
//        List<List<Cell>> grid = board.getBoard();
//
//        int size = board.getSize();
//        for(int col = 0; col < size; col++) {
//            if (grid.get(row).get(col).getSymbol() != player.getSymbol()) {
//                return false;
//            }
//        }
//        return true;

    }
}
