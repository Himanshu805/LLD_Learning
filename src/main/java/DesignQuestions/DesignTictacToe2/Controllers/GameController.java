package DesignQuestions.DesignTictacToe2.Controllers;

import DesignQuestions.DesignTictacToe2.Models.Board;
import DesignQuestions.DesignTictacToe2.Models.Game;
import DesignQuestions.DesignTictacToe2.Models.GameState;
import DesignQuestions.DesignTictacToe2.Models.Player;
import DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy.WinningStrategy;

import java.util.List;

public class GameController {
    Game game;

    public Game startNewGame(int size, List<Player> players, List<WinningStrategy> winningStrategies){
        this.game =  new Game(size, players, winningStrategies);
        return this.game;
    }

    public void displayBoard(){
         this.game.displayBoard();

    }

    public void makeMove(){
        this.game.makeMove();
    }

    public Player checkWinner(){
        return game.getWinner();
    }

    public GameState getGameState(){
        return game.getGameState();
    }






}
