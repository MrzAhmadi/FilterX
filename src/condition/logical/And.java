package condition.logical;

import condition.Logical;
import condition.Operator;
import java.util.List;

public class And extends Logical {
    public And(List<Operator> operands) {
        super(operands);
    }

    public And(Operator... operands) {
        super(operands);
    }
}
