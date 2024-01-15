package Day6.Hierarchical_inheritance;

public class Person {
    
    private String name;
    private int age;
    private String bloodGrp;

    public Person(){

        this.name = "Sakshi";
        this.age = 23;
        this.bloodGrp = "B+";
    }

    public Person (String name, int age, String bloodGrp){
        super();
        this.name = name;
        this.age = age;
        this.bloodGrp = bloodGrp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", bloogGrp=" + bloodGrp + "]";
    }

    
}
