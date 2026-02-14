package DesignQuestions.DesignTictacToe2.Strategy.BotPlayingStrategy;


import DesignQuestions.DesignTictacToe2.Models.Board;
import DesignQuestions.DesignTictacToe2.Models.Move;
import DesignQuestions.DesignTictacToe2.Models.Player;

public interface IBotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}
