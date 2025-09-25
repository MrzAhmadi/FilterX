package io.github.mrzahmadi.filterx.condition.comparison;

import io.github.mrzahmadi.filterx.core.Operator;

import java.util.Map;

public class Equals extends Operator {
    public Equals(String property, String term) {
        super(property, term);
    }

    @Override
    public boolean matches(Map<String, String> r) {
        String v = r.get(property);
        return v != null && v.equalsIgnoreCase(operand); // مقادیر case-insensitive
    }
}
