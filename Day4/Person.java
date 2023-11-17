package Day4;

public class Person {
    
    private String name;
    private int age;
    private String gender;
    private int income;
    private int tax;

    public Person(String name, int age, String gender, int income){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.income=income;
    }

    public String getNamw() {
        return name;
    }

    public void setNamw(String namw) {
        this.name = namw;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", income=" + income + ", tax=" + tax + "]";
    }

    

    

}
