package org.example.config;

import java.util.ArrayList;
import java.util.List;

public class TextStrategy implements ConfigStrategy {
    @Override
    public List<String> read() {
        return new ArrayList<>();
    }
}
