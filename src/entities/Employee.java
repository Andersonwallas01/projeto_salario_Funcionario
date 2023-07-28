package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee(){
    }

    public Employee(String name, Integer hours, Double valuPerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuPerHour;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public double Payment() {
      return hours * valuePerHour;
    }


}
