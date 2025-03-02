/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
import java.util.Date;

public class RequisForm {

    private int formId;
    private Date dateStart;
    private Date dateEnd;
    private String issue;
    private int status;
    private int userIdCreateForm;
    private int userIdAcceptForm;

    // Constructors
    public RequisForm() {
    }

    public RequisForm(Date dateStart, Date dateEnd, String issue, int status, int userIdCreateForm, int userIdAcceptForm) {

        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.issue = issue;
        this.status = status;
        this.userIdCreateForm = userIdCreateForm;
        this.userIdAcceptForm = userIdAcceptForm;
    }

    public RequisForm(int formId, Date dateStart, Date dateEnd, String issue, int status, int userIdCreateForm, int userIdAcceptForm) {
        this.formId = formId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.issue = issue;
        this.status = status;
        this.userIdCreateForm = userIdCreateForm;
        this.userIdAcceptForm = userIdAcceptForm;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
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

}
