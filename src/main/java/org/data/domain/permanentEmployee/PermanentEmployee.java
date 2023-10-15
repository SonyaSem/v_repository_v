package org.data.domain.permanentEmployee;

import org.data.domain.employee.Employee;

import java.time.LocalDate;
import java.util.Date;

// постоянные сотрудники
public class PermanentEmployee extends Employee {


    public PermanentEmployee(long personnelNumber, String firstName, String patronymic, String lastName, LocalDate birthday, String phone, String address, String education) {
        super(personnelNumber, firstName, patronymic, lastName, birthday, phone, address, education);
    }



}
