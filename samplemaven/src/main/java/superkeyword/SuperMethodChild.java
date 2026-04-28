package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
public void display()
{
	System.out.println("Example for Super child method");
	super.display();//to invoke parent class method
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.display();
	}

}
