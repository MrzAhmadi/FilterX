package condition;

import java.util.*;

public abstract class Logical {
    protected final List<Operator> operands;

    protected Logical(List<Operator> operands) {
        if (operands == null || operands.isEmpty()) {
            throw new IllegalArgumentException(getClass().getSimpleName() + " needs at least one operand");
        }
        this.operands = List.copyOf(operands);
    }

    protected Logical(Operator... operands) {
        this(Arrays.asList(operands));
    }

    public List<Operator> getOperands() {
        return operands;
    }
}
