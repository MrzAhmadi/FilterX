package condition.logical;

import core.Filter;
import core.Logical;
import java.util.Map;

public class And extends Logical {
    public And(Filter... ops) { super(ops); }
    public And(java.util.List<? extends Filter> ops) { super(ops); }

    @Override public boolean matches(Map<String,String> r) {
        for (Filter f : operands) if (!f.matches(r)) return false;
        return true;
    }
}