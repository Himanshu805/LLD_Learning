package DesignQuestions.DesignTictacToe2.Models;

public abstract class Player {

    private String name;
    PlayerType playerType;
    private Symbol symbol;

    protected Player(String name, PlayerType type, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
        this.playerType = type;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }


    public abstract Move makeMove(Board board);


}
