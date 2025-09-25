package condition.logical;

import core.Filter;
import core.Logical;
import java.util.Map;

public class Not extends Logical {
    public Not(Filter op) { super(op); }

    @Override public boolean matches(Map<String,String> r) {
        return !operands.get(0).matches(r);
    }
}
