package DesignQuestions.DesignTictacToe2.Models;

import DesignQuestions.DesignTictacToe2.Strategy.WinningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;
    private int nextPlayerTurnIndex;
    private List<Move> moves;
    private Player winner;

    public Game(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.nextPlayerTurnIndex =0;
    }


    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getNextPlayerTurnIndex() {
        return nextPlayerTurnIndex;
    }

    public void setNextPlayerTurnIndex(int nextPlayerTurnIndex) {
        this.nextPlayerTurnIndex = nextPlayerTurnIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void displayBoard(){
        this.board.displayBoard();
    }

    public void makeMove(){
        Player currPlayer = players.get(nextPlayerTurnIndex);
        System.out.println("Player " + currPlayer.getName() + " is playing");

        Move move = currPlayer.makeMove(board);

        if(validateMove(move)) {
            updateGameAfterValidMove(move);
        }

        if(checkWinner(move)){
            winner = move.getPlayer();
            gameState = GameState.WON;
        }
        else if(checkDraw(move)){
            gameState = GameState.DRAW;
        }

    }

    private boolean checkDraw(Move move) {
        if(moves.size() == board.getSize()*board.getSize()){
            return true;
        }
        return false;
    }

    public boolean checkWinner(Move move){

        // check the winner
        for (WinningStrategy winningStrategy : winningStrategies) {
            if (winningStrategy.checkWinner(board, move)) {
                return true;
            }

        }
        return false;
    }

    private boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell cell = move.getCell();

        if(row <0 || row >= board.getSize() || col < 0 || col >= board.getSize() || cell.getCellState().equals(CellState.OCCUPIED)){
            return false;
        }
        return true;
    }


    private void updateGameAfterValidMove(Move move){
        int  row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // update cell
        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.OCCUPIED);
        cell.setPlayer(move.getPlayer());
        cell.setSymbol(move.getPlayer().getSymbol());
        move.setCell(cell);

        // add the current move in moves list
        moves.add(move);

        // update next player index
        nextPlayerTurnIndex++;
        nextPlayerTurnIndex %= players.size();


    }
}
