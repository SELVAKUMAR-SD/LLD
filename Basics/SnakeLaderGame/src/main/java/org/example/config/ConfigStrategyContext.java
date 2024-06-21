package org.example.config;

import java.util.List;

public class ConfigStrategyContext {
    ConfigStrategy strategy;

    public void setStrategy(ConfigStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> readConfig() {
        return this.strategy.read();
    }
}
