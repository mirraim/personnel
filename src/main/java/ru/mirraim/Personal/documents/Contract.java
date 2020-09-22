package ru.mirraim.Personal.documents;

import ru.mirraim.Personal.Employee;
import ru.mirraim.Personal.Staff;

public class Contract extends Document{
    private String position;

    public Contract(Employee employee) {
        super(employee);
        this.position = employee.getPosition().toString().toLowerCase();
        setPrefix("CON-");
    }

    public static Contract createContract(Employee employee){
        Contract contract = new Contract(employee);
        contract.setDocumentNumber(Staff.getContracts().size() + 1);
        return contract;
    }


}
