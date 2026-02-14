package DesignQuestions.DesignTictacToe2.Strategy.BotPlayingStrategy;

import DesignQuestions.DesignTictacToe2.Models.*;


public class EasyBotPlayingStrategy implements IBotPlayingStrategy {

    @Override
    public Move makeMove(Board board, Player player) {

        for(int i = 0; i < board.getSize(); i++){
            for(int j = 0; j < board.getSize(); j++){
                if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    return new Move(new Cell(i,j), player);
                }
            }
        }
        return null;
    }
}
