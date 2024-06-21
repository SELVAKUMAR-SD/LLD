package org.example.board;

import org.example.cell.Cell;

import java.util.List;

public class Board {
    List<Cell> cellList;

    public void setCell(Cell cell) {
        this.cellList.add(cell);
    }
}
