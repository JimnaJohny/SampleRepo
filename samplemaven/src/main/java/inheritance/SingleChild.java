package inheritance;

public class SingleChild extends SingleParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj=new SingleChild();
		obj.display();
		obj.print();
	}
	public void print()
	{
		System.out.println("This is the child class");
	}

}
