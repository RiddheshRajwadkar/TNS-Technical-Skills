package Day5;

public class Executor {
    public static void main(String[] args) {
		Base b=new Base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		b.varDefault=50;
		b.varProtected=24;
		b.varPublic=67;

		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
    }
}
