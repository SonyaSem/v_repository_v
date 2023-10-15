package org.example;

import org.data.domain.Dictionary;
import org.data.domain.department.Department;
import org.data.domain.homeWork2.*;
import org.data.domain.permanentEmployee.PermanentEmployee;
import org.data.domain.position.Position;

import java.time.LocalDate;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        ArrayList<BaseDocument> documents = new ArrayList<>();

        PermanentEmployee permanentEmployee1 = new PermanentEmployee(12341234, "Софья", "Алексеевна", "Семичева", LocalDate.of(2000, 12, 31), "899911122", "г. Пенза, ул. Пушкина 10", "Школа 222, ПГУ");
        PermanentEmployee permanentEmployee2 = new PermanentEmployee(12341234, "Иван", "Петрович", "Лебедев", LocalDate.of(2000, 12, 31), "899911122", "г. Пенза, ул. Пушкина 10", "Школа 222, ПГУ");
        Position position1 = new Position("Бухгалтер", 40000);
        Position position2 = new Position("Менеджер", 50000);
        Department department = new Department("Бухгалтерия");

        DocumentRecruitment documentRecruitment1 = new DocumentRecruitment(permanentEmployee1, Dictionary.identityDocuments().get(0), "202929292", LocalDate.of(2023, 9,1), LocalDate.of(2023, 9,2), position1, department);
        DocumentRecruitment documentRecruitment2 = new DocumentRecruitment(permanentEmployee2, Dictionary.identityDocuments().get(0), "202926462", LocalDate.of(2023, 10,1), LocalDate.of(2023, 10,8), position2, department);

        DocumentTransfer documentTransfer1 = new DocumentTransfer(permanentEmployee1, Dictionary.identityDocuments().get(1), "3453646", LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 10), position2, department);
        DocumentTransfer documentTransfer2 = new DocumentTransfer(permanentEmployee2, Dictionary.identityDocuments().get(1), "3242556", LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 10), position1, department);

        DocumentDismissal documentDismissal = new DocumentDismissal(permanentEmployee1, Dictionary.identityDocuments().get(2), "24525646", LocalDate.of(2023, 11, 10), LocalDate.of(2023, 11, 10),"doc", "------");
        DocumentDismissal documentDismissal2 = new DocumentDismissal(permanentEmployee2, Dictionary.identityDocuments().get(2), "36325646", LocalDate.of(2023, 11, 10), LocalDate.of(2023, 11, 10),"проступок", "-----");

        documents.add(documentRecruitment1);
        documents.add(documentTransfer1);
        documents.add(documentDismissal);
        documents.add(documentRecruitment2);
        documents.add(documentTransfer2);
        documents.add(documentDismissal2);

        for (BaseDocument doc:documents) {
            String position = "";
            String dep= "";
            String reason ="";
            String description = "";

            String code = doc.getCode().getName();
            String documentNumber = doc.getDocumentNumber();
            String name = doc.getEmployee().fullName();
            String documentDate = doc.getDocumentDate().toString();
            String startDate = doc.getDateStart().toString();
            if(!doc.getMarker().equals("Dismissal")){
                position = doc.getDoc()[0];
                dep= doc.getDoc()[1];

            }else{
                reason = doc.getDoc()[0];
                description =doc.getDoc()[1];
            }

            System.out.printf("%-40s %-15s %-30s %-15s %-15s %-20s %-20s %-20s %-20s\n", code, documentNumber, name, documentDate, startDate, position, dep, reason, description);

        }

    }

}
