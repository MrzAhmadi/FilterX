package condition.logical;

import core.Filter;
import core.Logical;
import core.Operator;

import java.util.Map;

public class Or extends Logical implements Filter {
    public Or(Operator... ops) {
        super(ops);
    }

    public Or(java.util.List<Operator> ops) {
        super(ops);
    }

    @Override
    public boolean matches(Map<String, String> r) {
        for (Operator op : operands) if (op.matches(r)) return true;
        return false;
    }
}