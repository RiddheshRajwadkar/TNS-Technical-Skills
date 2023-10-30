package Day2;

public class Typecast {
    //The process to convert one datatype to another datatype.
    //It can be done automatically and manually.

    public static void main(String[] args) {

    int num1=24546;
    //short num2=num1;(Type mismatch: cannot convert from int to short)
    short num2=(short)num1;//(manually converting int to short by using parantheses)

    System.out.println(num2);
    }
}
