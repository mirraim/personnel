package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;

public class LayOffOrder extends Document implements Order {
    public LayOffOrder(Employee employee) {
        super(employee);
    }
}
