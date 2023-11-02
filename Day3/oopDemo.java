package Day3;
/*
 * OOP: Object oriented programming is core of java programming. It is used to design a program using classes and objects.
 */

 //Encapsulation: Encapsulation is a key  of OOP. It refers to bundling 
public class oopDemo {

    private String Name;
    private int rollNo;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "oopDemo [Name=" + Name + ", rollNo=" + rollNo + "]";
    }
    
    

    
    
}
