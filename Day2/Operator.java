package Day3;

public class Operator {
    public static void main(String[] args) {
        int a=12;
        int b=30;
        int c=49;

        System.out.println(++a);//a=13
        System.out.println(a++ + b++ + c);//13+30+49 //a=14 b=31 c=49
        System.out.println(a + ++b + ++c);//a=14 b=32 c=50
        System.out.println("Value of a:" + a);//14
        System.out.println("Value of b:" + b);//32
        System.out.println("Value of c:" + c);//50
    }
}
