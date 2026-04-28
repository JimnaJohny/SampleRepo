package inheritance;

public class HierarchicalChild2 extends HierarchicalParent{
public void show2()
{
	System.out.println("This is Child2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HierarchicalChild2 obj=new HierarchicalChild2();
obj.print();
obj.show2();
	}

}
