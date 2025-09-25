package io.github.mrzahmadi.filterx.condition.literals;

import io.github.mrzahmadi.filterx.core.Operator;

import java.util.Map;

public class False extends Operator {
    public False() {
        super();
    }

    @Override
    public boolean matches(Map<String, String> r) {
        return false;
    }
}