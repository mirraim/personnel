package ru.mirraim.Personal;

import ru.mirraim.Personal.documents.Contract;
import ru.mirraim.Personal.documents.Order;
import ru.mirraim.Personal.documents.RecruitOrder;

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
        employee.setContractNumber(contract.getDocumentNumber());
        RecruitOrder recruitOrder = RecruitOrder.createOrder(employee);
        orders.add(recruitOrder);
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
