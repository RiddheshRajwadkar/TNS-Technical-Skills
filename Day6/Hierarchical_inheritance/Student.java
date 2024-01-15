package Day6.Hierarchical_inheritance;

public class Student extends Person{
    
    private String branch;
    private int rollNo;

    public Student(){
        this.branch = "CSE";
        this.rollNo = 123;
    }

    public Student(String branch, int rollNo){
        this.branch = branch;
        this.rollNo = rollNo;
    }

    public Student(String name, int age, String bloodGrp, String branch, int rollNo){
        super(name, age, bloodGrp);
        this.branch = branch;
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [branch=" + branch + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getBloodGrp()=" + getBloodGrp() + "]";
    }

    
}
