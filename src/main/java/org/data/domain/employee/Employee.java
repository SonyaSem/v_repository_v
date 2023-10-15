package org.data.domain.employee;

import org.data.exception.MyException;

import java.time.LocalDate;
import java.util.Date;

public abstract class Employee {

    private long personnelNumber;
    private String firstName;
    private String patronymic;
    private String lastName;
    private LocalDate birthday;
    private String phone;
    private String address;
    private String education;

    public Employee(long personnelNumber, String firstName, String patronymic, String lastName, LocalDate birthday, String phone, String address, String education) {
        this.personnelNumber = personnelNumber;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.education = education;
    }

    public long getPersonnelNumber() {
        return personnelNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String fullName(){
         return String.format("%s %s %s", firstName, patronymic, lastName);
    }


}
