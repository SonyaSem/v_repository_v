package org.data;

import org.data.domain.department.Department;
import org.data.domain.permanentEmployee.PermanentEmployee;
import org.data.domain.position.Position;
import org.data.domain.workStory.WorkStory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

class WorkStoryTest {

    LocalDate birthday = LocalDate.of(2023, 9, 17);
    LocalDate startDate = LocalDate.of(2023, 9, 20);

    Department department = new Department("Бухгалтерия");
    Position position = new Position("Бухгалтер", 40000);
    PermanentEmployee permanentEmployee = new PermanentEmployee(12341234, "Софья", "Алексеевна", "Семичева", birthday, "899911122", "г. Пенза, ул. Пушкина 10", "Школа 222, ПГУ");
    WorkStory workStory = new WorkStory(permanentEmployee, startDate, position, department);

    @Test
    void test(){

        Assertions.assertEquals(permanentEmployee, workStory.getEmployee());
        Assertions.assertEquals(startDate, workStory.getStartDate());
        Assertions.assertEquals(position, workStory.getPosition());
        Assertions.assertEquals(department, workStory.getDepartment());

    }

    @Test
    void setEndDate() {

        LocalDate endDate = LocalDate.of(2023, 9, 20);;
        workStory.setEndDate(endDate);

        Assertions.assertEquals(endDate, workStory.getEndDate());

    }
}