package org.example.dice;

public class DiceContext {
    DiceStrategy strategy;

    public DiceContext(DiceStrategy strategy) {
        this.strategy = strategy;
    }

    public int roleDice() {
        return this.strategy.roleDice();
    }
}
