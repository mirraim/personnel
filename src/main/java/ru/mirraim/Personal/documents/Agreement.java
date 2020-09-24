package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;
import ru.mirraim.Personal.Position;

public class Agreement extends Document{
    private Contract contract;
    private Position newPosition;
    private int newSalary;


    public Agreement(Employee employee, Position position, int salary) {
       super(employee);
       this.contract = employee.getContract();
       this.newPosition = position;
       this.newSalary = salary;
    }

    @Override
    public void setDocumentNumber(int id) {
        this.documentNumber = contract.getDocumentNumber() + " Agr - " + id;
    }

    public Agreement createAgreement(Employee employee, Position position, int salary){
        Agreement agreement = new Agreement(employee, position, salary);
        agreement.setDocumentNumber(employee.getAgreements().size() + 1);
        return agreement;
    }
}
