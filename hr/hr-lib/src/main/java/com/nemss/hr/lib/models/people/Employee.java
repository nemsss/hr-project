package com.nemss.hr.lib.models.people;

import com.nemss.hr.lib.models.BaseEntity;
import com.nemss.hr.lib.models.Role;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee extends BaseEntity {

    @JoinColumn(name = "applicant_id")
    @OneToOne
    private Long applicant;

    @JoinColumn(name = "role_id", nullable = false)
    @ManyToOne
    private Role role;

    private String firstName;
    private String middleName;
    private String lastName;

    private LocalDate dob;
    private char gender;

    private String mobileNO;
    private String email;
    private String address;

    private LocalDate dateEmployed;

    public Long getApplicant() {
        return applicant;
    }

    public void setApplicant(Long applicant) {
        this.applicant = applicant;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getMobileNO() {
        return mobileNO;
    }

    public void setMobileNO(String mobileNO) {
        this.mobileNO = mobileNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateEmployed() {
        return dateEmployed;
    }

    public void setDateEmployed(LocalDate dateEmployed) {
        this.dateEmployed = dateEmployed;
    }
}
