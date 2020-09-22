package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;

import java.util.Date;

public abstract class Document {
    private Employee employee;
    private String prefix = "D-";
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
        this.staffName = employee.getName() + " " + employee.getSurname();
        this.date = new Date();
    }

    public void setDocumentNumber(int id) {
        this.documentNumber = prefix + id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Date getDate() {
        return date;
    }

}
