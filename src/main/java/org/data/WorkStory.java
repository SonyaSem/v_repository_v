package org.data;

import java.util.Date;

// трудовая история в организации
public class WorkStory {

    private Employee employee;
    private Date startDate;
    private Date endDate = null;

    private Position position;
    private Department department;

    //private long contractNumber;

    public WorkStory(Employee employee, Date startDate,   Position position, Department department) {
        this.employee = employee;
        this.startDate = startDate;

        this.position = position;
        this.department = department;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
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
