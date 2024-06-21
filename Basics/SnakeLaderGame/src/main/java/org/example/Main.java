package org.example;

import org.example.board.Board;
import org.example.config.ConfigStrategy;
import org.example.config.ConfigStrategyContext;
import org.example.config.TextStrategy;
import org.example.game.Game;
import org.example.player.Player;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("player1");
        Player p2 = new Player("player2");
        Game g = new Game();
        g.setPlayer(p1);
        g.setPlayer(p2);
        Board board = new Board();
        g.setBoard(board);

        ConfigStrategyContext configStrategyContext = new ConfigStrategyContext();
        ConfigStrategy configStrategy = new TextStrategy();
        configStrategyContext.setStrategy(configStrategy);

        g.setBoardByConfig(configStrategyContext);
        g.setBoardCellByConfig(configStrategyContext);
    }
}
