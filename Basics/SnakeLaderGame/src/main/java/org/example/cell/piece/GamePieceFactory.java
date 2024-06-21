package org.example.cell.piece;

public class GamePieceFactory {
    public GamePiece getGamePiece(String piece) throws Exception {
        if (piece.equals("S")) {
            return new Snake();
        } else if (piece.equals("L")) {
            return new Ladder();
        }

        throw new Exception("Invalid GamePiece");
    }
}
