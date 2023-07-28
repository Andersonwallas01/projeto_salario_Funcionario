package entities;

public class OutSourcedEmployee extends Employee {
    private double additionalCharge;

    public OutSourcedEmployee(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutSourcedEmployee(String name, Integer hours, Double valuPerHour, double additionalCharge) {
        super(name, hours, valuPerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double Payment() {
        return super.Payment() + additionalCharge * 1.1;
    }
}
