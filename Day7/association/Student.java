package association;

public class Student {

    private String name;
    private int rollNo;
    
    private Address address;//association

    public Student(String name, int rollNo, Address address){
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void toDisplay() {
        System.out.println("Student [name=" + name + ", rollNo=" + rollNo + ", address=" + address.getFlatNo() + address.getStreet() + address.getCity() + address.getPincode());
    }

    
}