package inheritance;

public class Child implements Parent1, Parent2 {
	public void display() {
		System.out.println("Display Method from Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.show();
		obj.print();
		obj.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Method from Parent2");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print Method from Parent1");
	}

}
