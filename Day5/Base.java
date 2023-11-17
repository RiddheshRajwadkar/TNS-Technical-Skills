package Day5;

public class Base {

    private int varPrivate = 10;
	int varDefault = 20;
	protected int varProtected = 30;
	public int varPublic = 40;

    private void methodPrivate()
	{
		System.out.println("Private variable:"+varPrivate);
	}
	 void methodDefault()
	{
		System.out.println("Default variable:"+varDefault);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected variable:"+varProtected);
	}
	public void methodPublic()
	{
		System.out.println("Protected variable:"+varPublic);
	}

    public void display()
	{
		varProtected=67;
		methodProtected();
	}

}
