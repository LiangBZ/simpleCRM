package cn.com.noomn.dao;

import java.util.Date;

public class Employee {
    private String employeeId;

    private String departmentId;

    private String userroleId;

    private String nextDepDepartmentId;

    private String employeeNumber;

    private String employeeName;

    private String employeeSex;

    private String employeeEmail;

    private String employeePhone;

    private String employeeAddress;

    private Date employeeBirthday;

    private String employeeIdnumber;

    private Date employeeEntrydate;

    private String employeeState;

    private String employeePassword;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getUserroleId() {
        return userroleId;
    }

    public void setUserroleId(String userroleId) {
        this.userroleId = userroleId == null ? null : userroleId.trim();
    }

    public String getNextDepDepartmentId() {
        return nextDepDepartmentId;
    }

    public void setNextDepDepartmentId(String nextDepDepartmentId) {
        this.nextDepDepartmentId = nextDepDepartmentId == null ? null : nextDepDepartmentId.trim();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex == null ? null : employeeSex.trim();
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail == null ? null : employeeEmail.trim();
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress == null ? null : employeeAddress.trim();
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdnumber() {
        return employeeIdnumber;
    }

    public void setEmployeeIdnumber(String employeeIdnumber) {
        this.employeeIdnumber = employeeIdnumber == null ? null : employeeIdnumber.trim();
    }

    public Date getEmployeeEntrydate() {
        return employeeEntrydate;
    }

    public void setEmployeeEntrydate(Date employeeEntrydate) {
        this.employeeEntrydate = employeeEntrydate;
    }

    public String getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(String employeeState) {
        this.employeeState = employeeState == null ? null : employeeState.trim();
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword == null ? null : employeePassword.trim();
    }
}