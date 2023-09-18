package org.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


class PermanentEmployeeTest {
    @Test
    void test(){

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date birthday = null;
        try {
            birthday = format.parse("17.09.2023");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        PermanentEmployee permanentEmployee = new PermanentEmployee(12341234, "Софья", "Алексеевна", "Семичева", birthday , "899911122", "г. Пенза, ул. Пушкина 10", "Школа 222, ПГУ");
        Assertions.assertEquals("Софья", permanentEmployee.getFirstName());
        Assertions.assertEquals("Алексеевна", permanentEmployee.getPatronymic());
        Assertions.assertEquals("Семичева", permanentEmployee.getLastName());
        Assertions.assertEquals(birthday, permanentEmployee.getBirthday());
        Assertions.assertEquals("899911122", permanentEmployee.getPhone());
        Assertions.assertEquals("г. Пенза, ул. Пушкина 10", permanentEmployee.getAddress());
        Assertions.assertEquals("Школа 222, ПГУ", permanentEmployee.getEducation());

    }


}