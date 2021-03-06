package wagner.stephanie.lizzie.rules;

import wagner.stephanie.lizzie.Lizzie;

public class BoardData {
    public int moveNumber;
    public int[] lastMove;
    public int[] moveNumberList;
    public boolean blackToPlay;

    public Stone lastMoveColor;
    public Stone[] stones;
    public Zobrist zobrist;

    public boolean verify;

    public double winrate;
    public int playouts;

    public BoardData(Stone[] stones, int[] lastMove, Stone lastMoveColor, boolean blackToPlay, Zobrist zobrist, int moveNumber, int[] moveNumberList, double winrate, int playouts) {
        this.moveNumber = moveNumber;
        this.lastMove = lastMove;
        this.moveNumberList = moveNumberList;
        this.blackToPlay = blackToPlay;

        this.lastMoveColor = lastMoveColor;
        this.stones = stones;
        this.zobrist = zobrist;
        this.verify = false;

        this.winrate = winrate;
        this.playouts = playouts;
    }
}
