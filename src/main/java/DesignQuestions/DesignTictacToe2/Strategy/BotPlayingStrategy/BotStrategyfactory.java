package DesignQuestions.DesignTictacToe2.Strategy.BotPlayingStrategy;

import DesignQuestions.DesignTictacToe2.Models.BotDifficultyLevel;
import DesignQuestions.DesignTictacToe2.Models.Player;

public class BotStrategyfactory {

    public IBotPlayingStrategy getBotStrategy(BotDifficultyLevel botDifficultyLevel){
        if(botDifficultyLevel == BotDifficultyLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        else if(botDifficultyLevel == BotDifficultyLevel.MEDIUM){
            return null;
        }
        else if(botDifficultyLevel == BotDifficultyLevel.HARD){
            return null;
        }
        return null;
    }
}
