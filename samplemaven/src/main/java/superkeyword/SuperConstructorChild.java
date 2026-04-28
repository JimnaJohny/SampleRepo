package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{
public SuperConstructorChild()
{
	super(2,3);
    System.out.println("Jimna");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj=new SuperConstructorChild();//yellow warning because obj is not used, there is no method to invoke, that's why not used obj
	}

}
