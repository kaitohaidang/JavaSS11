package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(
                1,
                "Le Nguyen Hai Dang",
                15000000
        );

        employees[1] = new PartTimeEmployee(
                2,
                "Hai Dang Le Nguyen",
                80,
                100000
        );
        for (Employee e : employees) {
            e.showInfo();
            System.out.println(
                    "Salary: " + e.calculateSalary()
            );
        }

    }
}