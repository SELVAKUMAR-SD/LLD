package org.example.cell.piece;

import org.example.cell.piece.GamePiece;

public class Ladder implements GamePiece {
    int start, end;

    @Override
    public int getStart() {
        return start;
    }

    @Override
    public int getDestination() {
        return end;
    }
}
