package Day6.Hierarchical_inheritance;

public class Engineer extends Person{
    
    private String dept;
    private int salary;

    public Engineer(String dept, int salary){
        this.dept = dept;
        this.salary = salary;
    }

    public Engineer(){
        super();
    }

    public Engineer(String name, int age, String bloodGrp, String dept, int salary){
        super(name, age, bloodGrp);
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Engineer [dept=" + dept + ", salary=" + salary + ", getName()=" + getName()+ ", getAge=" + getAge() + ", getBloodGrp()=" + getBloodGrp() + "]";
    }

    
}
