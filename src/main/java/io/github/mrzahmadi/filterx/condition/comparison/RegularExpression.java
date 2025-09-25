package io.github.mrzahmadi.filterx.condition.comparison;

import io.github.mrzahmadi.filterx.core.Operator;

import java.util.Map;
import java.util.regex.Pattern;

public class RegularExpression extends Operator {
    private final Pattern pattern;

    public RegularExpression(String property, String regex) {
        super(property, regex);
        this.pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    }

    @Override
    public boolean matches(Map<String, String> r) {
        String v = r.get(property);
        return v != null && pattern.matcher(v).matches(); // full match
    }
}