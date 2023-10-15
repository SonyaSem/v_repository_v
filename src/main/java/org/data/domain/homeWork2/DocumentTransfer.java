package org.data.domain.homeWork2;

import org.data.domain.department.Department;
import org.data.domain.employee.Employee;
import org.data.domain.position.Position;

import java.time.LocalDate;


// документ для перевода сотрудника
public class DocumentTransfer extends BaseDocument {

    //новая должность
    Position newPosition;

    //новый отдел
    Department newDepartment;

    public DocumentTransfer(Employee employee,BaseDocumentType code, String documentNumber, LocalDate documentDate, LocalDate dateStart, Position newPosition, Department newDepartment) {
        super(employee, code, documentNumber, documentDate, dateStart);
        this.newPosition = newPosition;
        this.newDepartment = newDepartment;
    }

    @Override
    public String getMarker() {
        return "Transfer";
    }

    @Override
    public String[] getDoc() {
        String[] list = {newPosition.getName(), newDepartment.getName()};
        return list;
    }

}
