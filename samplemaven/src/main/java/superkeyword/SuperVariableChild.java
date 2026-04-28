package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
	String color="Black";
	public void print()
	{
		System.out.println(color);
		System.out.println(super.color);//printing color of Super class or parent class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj= new SuperVariableChild();
		obj.print();
	}

}
