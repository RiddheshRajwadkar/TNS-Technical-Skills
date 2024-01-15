package Day6.Hierarchical_inheritance;

public class HierarchicalinheritanceDemo {
    
    public static void main(String[] args) {
        
        Person obj = new Person();
        System.out.println(obj);//tight/static coupling

        Person obj2;
        
        obj2= new Person();//loose coupling/ dynamic coupling
        System.out.println(obj2);

        obj2 = new Engineer();
        System.out.println(obj2);

        obj2 = new Student();
        System.out.println(obj2);

    }
}
