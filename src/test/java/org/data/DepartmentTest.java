package org.data;

import org.data.domain.department.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DepartmentTest {

    @Test
    void test(){
        Department department = new Department("Бухгалтерия");
        Assertions.assertEquals("Бухгалтерия", department.getName());
    }

}
