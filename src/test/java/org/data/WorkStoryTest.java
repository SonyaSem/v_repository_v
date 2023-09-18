package org.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class WorkStoryTest {

    SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

    Date birthday = null;
    Date startDate = null;

    Department department = new Department("Бухгалтерия");
    Position position = new Position("Бухгалтер", 40000);

    @Test
    void test(){

        try {
            birthday = format.parse("17.09.2023");
            startDate = format.parse("20.09.2023");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        PermanentEmployee permanentEmployee = new PermanentEmployee(12341234, "Софья", "Алексеевна", "Семичева", birthday , "899911122", "г. Пенза, ул. Пушкина 10", "Школа 222, ПГУ");
        WorkStory workStory = new WorkStory(permanentEmployee, startDate, position, department);

        Assertions.assertEquals(permanentEmployee, workStory.getEmployee());
        Assertions.assertEquals(startDate, workStory.getStartDate());
        Assertions.assertEquals(position, workStory.getPosition());
        Assertions.assertEquals(department, workStory.getDepartment());

    }

    @Test
    void setEndDate() {

        Date endDate = null;
        try {
            birthday = format.parse("17.09.2023");
            startDate = format.parse("20.09.2023");
            endDate = format.parse("20.10.2023");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        PermanentEmployee permanentEmployee = new PermanentEmployee(12341234, "Софья", "Алексеевна", "Семичева", birthday , "899911122", "г. Пенза, ул. Пушкина 10", "Школа 222, ПГУ");
        WorkStory workStory = new WorkStory(permanentEmployee, startDate, position, department);
        workStory.setEndDate(endDate);

        Assertions.assertEquals(endDate, workStory.getEndDate());

    }
}