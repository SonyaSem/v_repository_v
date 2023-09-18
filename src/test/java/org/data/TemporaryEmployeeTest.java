package org.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TemporaryEmployeeTest {
    @Test
    void test(){

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date birthday = null;
        Date endDate = null;
        try {
            birthday = format.parse("17.09.2023");
            endDate = format.parse("30.09.2023");
        } catch (ParseException e) {
            e.printStackTrace();
        }

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