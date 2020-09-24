package ru.mirraim.Personal;

import ru.mirraim.Personal.documents.*;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private Staff instance = new Staff();

    private static List<Employee> staffList;
    private static List<Contract> contracts;
    private static List<Order> orders;

    private Staff() {
        staffList = new ArrayList<Employee>();
        contracts = new ArrayList<Contract>();
        orders = new ArrayList<Order>();
    }

    public Staff getInstance() {
        return instance;
    }

    public void recruit(String name, String surname, Position position, int salary){
      Employee employee = new Employee(name, surname, position, salary);
      staffList.add(employee);
        Contract contract = Contract.createContract(employee);
        contracts.add(contract);
        employee.setContract(contract);
        RecruitOrder recruitOrder = RecruitOrder.createOrder(employee);
        orders.add(recruitOrder);
    }

    public void layOff(Employee employee){
        LayOffOrder layOffOrder = LayOffOrder.createOrder(employee);
        employee.setPosition(Position.FIRED);
        employee.setSalary(0);
    }

    public void transfer(Employee employee, Position newPosition, int newSalary){
        Agreement agreement = new Agreement(employee,newPosition, newSalary);
        employee.addAgreement(agreement);
        TransferOrder transferOrder = new TransferOrder(employee, newPosition, newSalary);
        orders.add(transferOrder);
        employee.setPosition(newPosition);
        employee.setSalary(newSalary);
    }

    public static List<Employee> getStaffList() {
        return staffList;
    }

    public static List<Contract> getContracts() {
        return contracts;
    }

    public static List<Order> getOrders() {
        return orders;
    }

}
