package ie.atu;

public class Position extends Employee {
    private int salary;
    private int hours;

    public Position() {
        this.salary = 0;
        this.hours = 0;
    }

    public Position(String name, int age, int empNum, String department, int salary, int hours) {
        super(name, age, empNum, department);
        this.salary = salary;
        this.hours = hours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Position: " +
                "salary: " + salary +
                ", hours: " + hours;
    }
}
