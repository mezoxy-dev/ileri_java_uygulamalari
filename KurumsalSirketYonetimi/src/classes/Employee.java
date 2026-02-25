package classes;

import interfaces.IPayable;
import interfaces.IWorkable;

public class Employee extends Person implements IPayable, IWorkable {
    protected double baseSalary;
    protected Department department;

    public void performWork(){

    }

    @Override
    public void attendMeeting() {

    }

    public double calculateSalary(){
        return baseSalary;
    }

    @Override
    public void processBonus(double amount) {

    }

    @Override
    public String getID() {
        return "";
    }
}

class Department{
    private String name;
    public String getName(){
        return name;
    }

}