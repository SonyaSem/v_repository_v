package org.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @Test
    void test(){
        Position position = new Position("Бухгалтер", 40000);
        Assertions.assertEquals("Бухгалтер", position.getName());
        Assertions.assertEquals(40000, position.getSalary());
    }

}