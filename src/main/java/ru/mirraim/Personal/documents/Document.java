package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;

import java.util.Date;

public abstract class Document {
    private Employee employee;
    private static final String PREFIX = "D-";
    private int id;
    private String documentNumber;
    private String staffName;
    private Date date;

    public Employee getEmployee() {
        return employee;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public Document(Employee employee) {
        this.employee = employee;
        this.documentNumber= PREFIX + id;
        this.staffName = employee.getName() + " " + employee.getSurname();
        this.date = new Date();
    }

    public String getStaffName() {
        return staffName;
    }

    public Date getDate() {
        return date;
    }
}
