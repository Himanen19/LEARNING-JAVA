package org.example;

public class Employee extends Worker {

    private static int employeeNo = 1;
    private long employeeId;
    private String hireDate;

    public Employee() {

    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.hireDate = hireDate;
        this.employeeId = Employee.employeeNo++;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public long getEmployeeid() {
        return employeeId;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeId = employeeid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate='" + hireDate + '\'' +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}
