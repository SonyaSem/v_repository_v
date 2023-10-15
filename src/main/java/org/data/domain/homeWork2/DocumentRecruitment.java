package org.data.domain.homeWork2;

import org.data.domain.department.Department;
import org.data.domain.employee.Employee;
import org.data.domain.position.Position;

import java.time.LocalDate;
import java.util.List;

public class DocumentRecruitment extends BaseDocument{

    //должность
    private Position position;
   // отдел
    private Department department;

    public DocumentRecruitment(Employee employee, BaseDocumentType code, String documentNumber, LocalDate documentDate, LocalDate dateStart, Position position, Department department) {
        super(employee, code, documentNumber, documentDate, dateStart);
        this.position = position;
        this.department = department;
    }

    @Override
    public String[] getDoc() {
        String[] list = {position.getName(), department.getName()};
        return list;
    }

    @Override
    public String getMarker() {
        return "Recruitment";
    }


}
