package core;

import java.util.Map;
import java.util.Objects;

public abstract class Operator implements Filter {
    protected final String property;
    protected final String operand;

    protected Operator() {
        this.property = null;
        this.operand = null;
    }

    protected Operator(String property) {
        this.property = Objects.requireNonNull(property, "property");
        this.operand = null;
    }

    protected Operator(String property, String operand) {
        this.property = Objects.requireNonNull(property, "property");
        this.operand = Objects.requireNonNull(operand, "operand");
    }

    protected String get(Map<String, String> r) {
        return r.get(property);
    }
}