public class TEstProgram {
    public static void main(String [] args){
        Employee e = new Employee("Sima",50000);
        //e.setName("Sima");
        //e.setBaseSalary(50000);
        Manager m = new Manager("Salma",60000,20000);

        System.out.println("Employee name " + e.getName());
        System.out.println("Employee salary " + e.getSalary());
        System.out.println("Manager name " + m.getName());
        System.out.println("Manager bonus " + m.getBonus());
        System.out.println("Manager salary " + m.getSalary());
        //System.out.println("Employee name " + e.getName());
        //System.out.println("Employee name " + e.getName());

    }

}
