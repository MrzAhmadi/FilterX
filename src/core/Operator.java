package core;

public class Operator {

    private String propertyName;
    private String condition;

    public Operator() {
    }

    public Operator(String propertyName) {
        this.propertyName = propertyName;
    }

    public Operator(String propertyName, String condition) {
        this.propertyName = propertyName;
        this.condition = condition;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getCondition() {
        return condition;
    }
}
