package io.github.mrzahmadi.filterx.condition.logical;

import io.github.mrzahmadi.filterx.core.Filter;
import io.github.mrzahmadi.filterx.core.Logical;
import java.util.Map;

public class Or extends Logical {
    public Or(Filter... ops) { super(ops); }
    public Or(java.util.List<? extends Filter> ops) { super(ops); }

    @Override public boolean matches(Map<String,String> r) {
        for (Filter f : operands) if (f.matches(r)) return true;
        return false;
    }
}
