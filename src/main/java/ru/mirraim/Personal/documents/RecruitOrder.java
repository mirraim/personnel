package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;
import ru.mirraim.Personal.Staff;

public class RecruitOrder extends Document implements Order {

    public RecruitOrder(Employee employee) {
        super(employee);
        setPrefix("ORD-");
    }

    public static RecruitOrder createOrder(Employee employee){
       RecruitOrder recruitOrder = new RecruitOrder(employee);
       recruitOrder.setDocumentNumber(Staff.getOrders().size() + 1);
       return recruitOrder;
    }
}
