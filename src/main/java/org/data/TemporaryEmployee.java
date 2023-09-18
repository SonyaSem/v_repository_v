package org.data;

import java.util.Date;

// временные сотрудники
public class TemporaryEmployee extends Employee{

    //дата окончание договора о временном трудоустройстве
    Date contractEnd;
    public TemporaryEmployee(long personnelNumber, String firstName, String patronymic, String lastName, Date birthday, String phone, String address, String education, Date contractEnd) {
        super(personnelNumber, firstName, patronymic, lastName, birthday, phone, address, education);
        this.contractEnd = contractEnd;
    }

    public Date getContractEnd() {
        return contractEnd;
    }
}
