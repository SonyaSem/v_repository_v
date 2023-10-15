package org.data.domain.homeWork2;

import org.data.domain.employee.Employee;

import java.time.LocalDate;
import java.util.List;

abstract public class BaseDocument {
    private Employee employee;

    //документ
    private BaseDocumentType code;

    //номер документа
    private String documentNumber;

    // дата создания документа
    private LocalDate documentDate;

    // дата начала исполнения
    private LocalDate dateStart;


    public BaseDocument(Employee employee, BaseDocumentType code, String documentNumber, LocalDate documentDate, LocalDate dateStart) {
        this.employee = employee;
        this.code = code;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.dateStart = dateStart;
    }

    public abstract String[] getDoc();
    public abstract String getMarker();

    public Employee getEmployee() {
        return employee;
    }

    public BaseDocumentType getCode() {
        return code;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }


}
