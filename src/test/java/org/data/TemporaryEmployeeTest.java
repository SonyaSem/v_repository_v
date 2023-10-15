package org.data;

import org.data.domain.temporaryEmplyee.TemporaryEmployee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

class TemporaryEmployeeTest {
    @Test
    void test(){

        LocalDate birthday = LocalDate.of(2000, 12, 31);
        LocalDate endDate = LocalDate.of(2020, 12, 31);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(12341234, "Софья", "Алексеевна", "Семичева", birthday , "899911122", "г. Пенза, ул. Пушкина 10", "Школа 222, ПГУ", endDate);
        Assertions.assertEquals("Софья", temporaryEmployee.getFirstName());
        Assertions.assertEquals("Алексеевна", temporaryEmployee.getPatronymic());
        Assertions.assertEquals("Семичева", temporaryEmployee.getLastName());
        Assertions.assertEquals(birthday, temporaryEmployee.getBirthday());
        Assertions.assertEquals("899911122", temporaryEmployee.getPhone());
        Assertions.assertEquals("г. Пенза, ул. Пушкина 10", temporaryEmployee.getAddress());
        Assertions.assertEquals("Школа 222, ПГУ", temporaryEmployee.getEducation());
        Assertions.assertEquals(endDate, temporaryEmployee.getContractEnd());

    }

}