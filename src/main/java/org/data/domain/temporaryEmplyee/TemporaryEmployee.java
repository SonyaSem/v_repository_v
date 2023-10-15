package org.data.domain.temporaryEmplyee;

import org.data.domain.employee.Employee;

import java.time.LocalDate;
import java.util.Date;

// временные сотрудники
public class TemporaryEmployee extends Employee {

    //дата окончание договора о временном трудоустройстве
    LocalDate contractEnd;
    public TemporaryEmployee(long personnelNumber, String firstName, String patronymic, String lastName, LocalDate birthday, String phone, String address, String education, LocalDate contractEnd) {
        super(personnelNumber, firstName, patronymic, lastName, birthday, phone, address, education);
        this.contractEnd = contractEnd;
    }

    public LocalDate getContractEnd() {
        return contractEnd;
    }
}
