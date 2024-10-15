public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name= name;
        this.baseSalary=baseSalary;
    }

    public void setName(String newName){
        this.name=name;
    }
    public void setBaseSalary(double newSalary){
        this.baseSalary=baseSalary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return baseSalary;
    }
}
