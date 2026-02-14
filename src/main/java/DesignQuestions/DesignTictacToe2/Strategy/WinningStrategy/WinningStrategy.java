package DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy;

import DesignQuestions.DesignTictacToe2.Models.Board;
import DesignQuestions.DesignTictacToe2.Models.Move;
import DesignQuestions.DesignTictacToe2.Models.Player;

public interface WinningStrategy {
     boolean checkWinner(Board board, Move move);
}
