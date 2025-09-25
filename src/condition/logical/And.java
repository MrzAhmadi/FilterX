package condition.logical;

import core.Filter;
import core.Logical;
import core.Operator;

import java.util.Map;

public class And extends Logical implements Filter {
    public And(Operator... ops) {
        super(ops);
    }

    public And(java.util.List<Operator> ops) {
        super(ops);
    }

    @Override
    public boolean matches(Map<String, String> r) {
        for (Operator op : operands) if (!op.matches(r)) return false;
        return true;
    }
}