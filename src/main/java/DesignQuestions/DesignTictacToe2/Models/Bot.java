package DesignQuestions.DesignTictacToe2.Models;

import DesignQuestions.DesignTictacToe2.Strategy.BotPlayingStrategy.BotStrategyfactory;
import DesignQuestions.DesignTictacToe2.Strategy.BotPlayingStrategy.IBotPlayingStrategy;

public class Bot extends Player {

    BotDifficultyLevel difficultyLevel;

    public Bot(String name, PlayerType type, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, type, symbol);
        this.difficultyLevel = difficultyLevel;
    }

    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        BotStrategyfactory botStrategyfactory = new BotStrategyfactory();
        IBotPlayingStrategy botPlayingStrategy =  botStrategyfactory.getBotStrategy(difficultyLevel);
        return botPlayingStrategy.makeMove(board, this);
    }
}
