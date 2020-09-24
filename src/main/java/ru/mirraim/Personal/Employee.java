package ru.mirraim.Personal;

import ru.mirraim.Personal.documents.Agreement;
import ru.mirraim.Personal.documents.Contract;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String surname;
    private Position position;
    private int salary;
    private Contract contract;
    private List <Agreement> agreements;

    public Employee(String name, String surname, Position position, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
        this.agreements = new ArrayList<Agreement>();
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public List<Agreement> getAgreements() {
        return agreements;
    }

    public void addAgreement(Agreement agreement){
        agreements.add(agreement);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position=" + position +
                '}';
    }
}
