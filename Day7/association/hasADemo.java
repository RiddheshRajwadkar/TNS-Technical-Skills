package association;


public class hasADemo {
    public static void main(String[] args) {
        Address add = new Address(54, "Karanjade", "Mumbai", 42109);
        Student  stud = new Student("Riddhesh", 141, add);

        stud.toDisplay();
    }
}
