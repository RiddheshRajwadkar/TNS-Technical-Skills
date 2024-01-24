package association;

public class isADemo {
    
    public static void main(String[] args) {
        
        Manager man = new Manager();
        System.out.println(man);

        Manager man1 = new Manager("Riddhesh", 141, "Development", 5);
        Employee emp = new Employee("Rohan", 24, "Finanace");

        System.out.println(man1);
        System.out.println(emp);
    }
}
