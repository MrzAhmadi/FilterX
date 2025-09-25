package condition.logical;

import core.Filter;
import core.Logical;
import core.Operator;

import java.util.Map;

public class Not extends Logical implements Filter {
    public Not(Operator op) {
        super(op);
    }

    @Override
    public boolean matches(Map<String, String> r) {
        return !operands.get(0).matches(r);
    }
}
