package br.cesul;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(1000);
        employee.applyRaise(25);
        System.out.println("O novo salário será R$ " + employee.getSalary());
    }
}
