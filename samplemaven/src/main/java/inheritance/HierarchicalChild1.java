package inheritance;

public class HierarchicalChild1 extends HierarchicalParent{
public void show1()
{
	System.out.println("This is child1");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HierarchicalChild1 obj=new HierarchicalChild1();
obj.print();
obj.show1();

	}

}
