package org.example;

public class FullTimeEmployee extends Employee implements BonusEligible {
    double baseSalary;
    public FullTimeEmployee (int id , String name , double baseSalary) {
        super(id, name);
        this.baseSalary=baseSalary;
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }

    @Override
    public double calculateBonus() {
        return baseSalary*0.1;
    }
}
