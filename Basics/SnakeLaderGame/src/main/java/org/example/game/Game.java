package org.example.game;

import org.example.board.Board;
import org.example.cell.Cell;
import org.example.config.ConfigStrategyContext;
import org.example.player.Player;

import java.util.List;

public class Game {
    Board board;
    List<Player> playerList;

    int bordSize = 100;

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayer(Player player) {
        this.playerList.add(player);
    }

    public void setBoardByConfig(ConfigStrategyContext configContext) {
        for (int i = 0; i < this.bordSize; i++) {
            Cell cell = new Cell(null);
            this.board.setCell(cell);
        }
    }

    public void setBoardCellByConfig(ConfigStrategyContext configContext) {

    }

    public void makeMove() {

    }
}
