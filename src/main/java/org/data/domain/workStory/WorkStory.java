package org.data.domain.workStory;

import org.data.domain.department.Department;
import org.data.domain.employee.Employee;
import org.data.domain.position.Position;

import java.time.LocalDate;
import java.util.Date;

// трудовая история в организации
public class WorkStory {

    private Employee employee;
    private LocalDate startDate;
    private LocalDate endDate = null;

    private Position position;
    private Department department;

    //private long contractNumber;

    public WorkStory(Employee employee,  LocalDate startDate,   Position position, Department department) {
        this.employee = employee;
        this.startDate = startDate;

        this.position = position;
        this.department = department;
    }

    public void setEndDate( LocalDate endDate) {
        this.endDate = endDate;
    }

    public  LocalDate getStartDate() {
        return startDate;
    }

    public  LocalDate getEndDate() {
        return endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }
}
