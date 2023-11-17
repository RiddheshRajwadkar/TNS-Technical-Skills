package Day5;

public class Executor1 extends Base{
    public static void main(String[] args) {
		Base b = new Base();

		b.methodPublic();
		b.display();

		b.varPublic = 67;

		b.methodPublic();


	}
}
