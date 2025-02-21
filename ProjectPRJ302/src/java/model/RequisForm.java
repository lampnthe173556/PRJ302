/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
import java.time.LocalDate;

public class RequisForm {
    private int formId;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String issue;
    private int status;
    private int userIdCreateForm;
    private int userIdAcceptForm;

    // Constructors
    public RequisForm() {
    }

    public RequisForm(int formId, LocalDate dateStart, LocalDate dateEnd, String issue, int status, int userIdCreateForm, int userIdAcceptForm) {
        this.formId = formId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.issue = issue;
        this.status = status;
        this.userIdCreateForm = userIdCreateForm;
        this.userIdAcceptForm = userIdAcceptForm;
    }

    // Getters and Setters
    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUserIdCreateForm() {
        return userIdCreateForm;
    }

    public void setUserIdCreateForm(int userIdCreateForm) {
        this.userIdCreateForm = userIdCreateForm;
    }

    public int getUserIdAcceptForm() {
        return userIdAcceptForm;
    }

    public void setUserIdAcceptForm(int userIdAcceptForm) {
        this.userIdAcceptForm = userIdAcceptForm;
    }

    // toString method
    @Override
    public String toString() {
        return "RequisForm{" +
                "formId=" + formId +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", issue='" + issue + '\'' +
                ", status=" + status +
                ", userIdCreateForm=" + userIdCreateForm +
                ", userIdAcceptForm=" + userIdAcceptForm +
                '}';
    }
}

