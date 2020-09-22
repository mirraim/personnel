package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;

public class Contract extends Document{
    private static final String PREFIX = "CON-";
    private String position;

    public Contract(Employee employee) {
        super(employee);
        this.position = employee.getPosition().toString().toLowerCase();
    }
}
