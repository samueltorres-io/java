package company.data;

public class Employeer {

    String name;
    private double wage;

    public Employeer(String name, double wage) {
        this.name = name;
        this.wage = wage;

        System.out.println("Employeer name: " + name);
    }

    public void increaseSalary(double increase) {
        this.wage += increase;

        System.out.println(wage);
    }

}
