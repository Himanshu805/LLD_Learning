package DesignQuestions.DesignParkingLot.model;

public class Gate extends BaseModel{

    private String number;
    private GateType gateType;
    private Operator operator;

    public Gate(String number, GateType gateType, Operator operator) {
        this.number = number;
        this.gateType = gateType;
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public String getNumber() {
        return number;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
