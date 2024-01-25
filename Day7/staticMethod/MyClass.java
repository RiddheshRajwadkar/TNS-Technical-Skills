package staticMethod;

public class MyClass {
    private int section;
    private static int srNo;

    static{
        System.out.println("inside a static block");
        srNo = 10;
        System.out.println("srNo" + srNo);
    }

    public MyClass(){
        srNo++;
        section++;
    }

    public MyClass(int section){
        System.out.println("Inside a constructor");

        this.section = section;
    }

    @Override
    public String toString() {
        return "MyClass [section=" + section + "," + "srNo=" + srNo + "]";
    }

    static void display(){
        System.out.println("srNo=" + srNo);
    }

    
}
