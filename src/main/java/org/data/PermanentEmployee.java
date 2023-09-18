package org.data;

import java.util.Date;

// постоянные сотрудники
public class PermanentEmployee extends Employee{


    public PermanentEmployee(long personnelNumber, String firstName, String patronymic, String lastName, Date birthday, String phone, String address, String education) {
        super(personnelNumber, firstName, patronymic, lastName, birthday, phone, address, education);
    }

}
