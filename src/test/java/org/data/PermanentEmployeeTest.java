package org.data;

import org.data.domain.permanentEmployee.PermanentEmployee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PermanentEmployeeTest {
    @Test
    void test(){

        LocalDate birthday = LocalDate.of(2000, 12, 31);
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