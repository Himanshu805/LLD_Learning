package DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy;

import DesignQuestions.DesignTictacToe2.Models.*;

import java.util.HashMap;
import java.util.Map;

public class ColStrategy implements WinningStrategy {
    private Map<Integer, HashMap<Character,  Integer> > colCounts = new HashMap<>();


    @Override
    public boolean checkWinner(Board board, Move move) {


        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // check row is present in map or not, if not then add the row in map
        if(!colCounts.containsKey(col)){
            colCounts.put(col, new HashMap<>());
        }
        HashMap<Character, Integer> counts = colCounts.get(col);
        Player player = move.getPlayer();
        Symbol symbol = player.getSymbol();

        // update the symbol count in row
        counts.put(symbol.getSymbol(), counts.getOrDefault(symbol.getSymbol(),0) + 1);

        // check the winner
        return counts.get(symbol.getSymbol()) == board.getSize();



//        Player player = move.getPlayer();
//        int col = move.getCell().getCol();
//        List<List<Cell>> grid = board.getBoard();
//
//        int size = board.getSize();
//        for(int row = 0; row < size; row++){
//            if(grid.get(row).get(col).getSymbol() != player.getSymbol()){
//                return false;
//            }
//        }
//        return true;
    }
}
