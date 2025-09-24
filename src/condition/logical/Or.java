package condition.logical;

import condition.Logical;
import condition.Operator;
import java.util.List;

public class Or extends Logical {
    public Or(List<Operator> operands) {
        super(operands);
    }

    public Or(Operator... operands) {
        super(operands);
    }
}
