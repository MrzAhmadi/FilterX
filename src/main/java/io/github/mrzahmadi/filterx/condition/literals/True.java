package io.github.mrzahmadi.filterx.condition.literals;

import io.github.mrzahmadi.filterx.core.Operator;

import java.util.Map;

public class True extends Operator {
    public True() {
        super();
    }

    @Override
    public boolean matches(Map<String, String> r) {
        return true;
    }
}
