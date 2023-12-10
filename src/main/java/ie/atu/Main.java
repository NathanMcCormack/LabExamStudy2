package ie.atu;

public class Main {
    public static void main(String[] args) {

        Position person1 = new Position("Intern", "Nathan", 20, 5768, "Design", 40000,39);
        Position person2 = new Position();

        person2.setPosition("Manager");
        person2.setName("Paul");
        person2.setAge(20);
        person2.setEmpNum(2543);
        person2.setDepartment("Design");
        person2.setSalary(60000);
        person2.setHours(40);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}