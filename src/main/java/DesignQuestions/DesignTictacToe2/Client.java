package DesignQuestions.DesignTictacToe2;

import DesignQuestions.DesignTictacToe2.Controllers.GameController;
import DesignQuestions.DesignTictacToe2.Models.*;
import DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy.ColStrategy;
import DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy.DiagStrategy;
import DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy.RowStrategy;
import DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        GameController gameController = new GameController();

        // startGame
        int size = 3;
        Player p1 = new Human("player1", PlayerType.HUMAN, new Symbol('X'),1);
        Player p2 = new Bot("player2", PlayerType.HUMAN, new Symbol('O'),BotDifficultyLevel.EASY);

        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        List<WinningStrategy> winningStrategyList = new ArrayList<>();
        winningStrategyList.add(new RowStrategy());
        winningStrategyList.add(new ColStrategy());
        winningStrategyList.add(new DiagStrategy());

        Game game = gameController.startNewGame(size, players, winningStrategyList);

        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            gameController.displayBoard();
            gameController.makeMove();
        }

        if(game.getGameState().equals(GameState.WON) ){
            System.out.println("Congratulations! You win!");
        }
        else if(game.getGameState().equals(GameState.DRAW)){
            System.out.println("Game is over! it is draw");
        }
    }
}
