package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;
import ru.mirraim.Personal.Staff;

public class LayOffOrder extends Document implements Order {
    public LayOffOrder(Employee employee) {
        super(employee);
    }

    public static LayOffOrder createOrder(Employee employee){
        LayOffOrder layOffOrder= new LayOffOrder(employee);
        layOffOrder.setDocumentNumber(Staff.getOrders().size() + 1);
        return layOffOrder;
    }
}
