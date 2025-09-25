package condition.comparison;

import core.Operator;

import java.util.Map;

public class Less extends Operator {
    private final double threshold;

    public Less(String property, String number) {
        super(property, number);
        this.threshold = Double.parseDouble(number);
    }

    @Override
    public boolean matches(Map<String, String> r) {
        String v = r.get(property);
        if (v == null) return false;
        try {
            return Double.parseDouble(v) < threshold;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
