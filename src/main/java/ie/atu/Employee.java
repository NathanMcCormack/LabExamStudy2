package ie.atu;

public class Employee extends Person {
    private int empNum;
    private String department;

    public Employee() {
        this.empNum = 0;
        this.department = "";
    }

    public Employee(String name, int age, int empNum, String department) {
        super(name, age);
        this.empNum = empNum;
        this.department = department;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Employee:" +
                "empNum:" + empNum +
                ", department:'" + department + '\'';
    }
}
