package org.data.domain.homeWork2;


import org.data.domain.employee.Employee;

import java.time.LocalDate;

// документ для увольнения сотрудника
public class DocumentDismissal extends BaseDocument {

    //причина увольнения
    private String reason;

    //подробности увольнения
    private String description;


    public DocumentDismissal(Employee employee, BaseDocumentType code, String documentNumber, LocalDate documentDate, LocalDate dateStart,  String reason, String description) {
        super(employee, code, documentNumber, documentDate, dateStart);
        this.reason = reason;
        this.description = description;
    }
    @Override
    public String getMarker() {
        return "Dismissal";
    }

    @Override
    public String[] getDoc() {
        String[] list = {reason, description};
        return list;
    }
}
