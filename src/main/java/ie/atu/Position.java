package ie.atu;

public class Position extends Employee {
    private String position;
    private int salary;
    private int hours;

    public Position() {
        this.salary = 0;
        this.hours = 0;
        this.position = "";
    }

    public Position(String position, String name, int age, int empNum, String department, int salary, int hours) {
        super(name, age, empNum, department);
        this.position = position;
        this.salary = salary;
        this.hours = hours;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
                position +
                ", salary: " + salary +
                ", hours: " + hours;
    }
}
