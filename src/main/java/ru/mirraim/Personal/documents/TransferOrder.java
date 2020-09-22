package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;

public class TransferOrder extends Document implements Order{

    public TransferOrder(Employee employee) {
        super(employee);
    }
}
