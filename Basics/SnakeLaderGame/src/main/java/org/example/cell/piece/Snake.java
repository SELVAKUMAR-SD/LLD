package org.example.cell.piece;

import org.example.cell.piece.GamePiece;

import java.util.ArrayList;

public class Snake implements GamePiece {
    ArrayList<Integer> body;
    @Override
    public int getStart() {
        return body.getFirst();
    }

    @Override
    public int getDestination() {
        return body.getLast();
    }
}
