package condition.logical;

import core.Logical;
import core.Operator;
import java.util.List;

public class Or extends Logical {
    public Or(List<Operator> operands) {
        super(operands);
    }

    public Or(Operator... operands) {
        super(operands);
    }
}
