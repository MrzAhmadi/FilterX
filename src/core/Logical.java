package core;

import java.util.*;

public abstract class Logical implements Filter {
    protected final List<Filter> operands;

    protected Logical(List<? extends Filter> operands) {
        if (operands == null || operands.isEmpty()) {
            throw new IllegalArgumentException(getClass().getSimpleName() + " needs at least one operand");
        }
        this.operands = List.copyOf(operands);
    }

    protected Logical(Filter... operands) {
        this(Arrays.asList(operands));
    }

    public List<Filter> getOperands() {
        return operands;
    }
}