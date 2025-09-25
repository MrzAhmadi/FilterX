package io.github.mrzahmadi.filterx.condition.comparison;

import io.github.mrzahmadi.filterx.core.Operator;

import java.util.Map;

public class Exist extends Operator {
    public Exist(String property) {
        super(property);
    }

    @Override
    public boolean matches(Map<String, String> r) {
        return r.containsKey(property);
    }
}