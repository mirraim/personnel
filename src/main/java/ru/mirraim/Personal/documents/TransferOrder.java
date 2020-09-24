package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;
import ru.mirraim.Personal.Position;
import ru.mirraim.Personal.Staff;

public class TransferOrder extends Document implements Order{
    private Position newPosition;
    private int newSalary;

    public TransferOrder(Employee employee, Position position, int salary) {
        super(employee);
        this.newPosition = position;
        this.newSalary = salary;
    }

    public static TransferOrder createOrder(Employee employee, Position position, int salary){
        TransferOrder transferOrder = new TransferOrder(employee, position, salary);
        transferOrder.setDocumentNumber(Staff.getOrders().size() + 1);
        return transferOrder;
    }
}
