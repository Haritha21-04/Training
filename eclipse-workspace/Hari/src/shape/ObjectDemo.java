package shape;
class Box{
	private int size;
	public Box() {
		size=0;
	}
	public Box(int size) {
		this.size=size;
	}
	public String toString() {
		return "Size of Box"+size;
	}
	public boolean
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(5);
		Box b2=new Box(5);
		System.out.println("Box 1"+ b1.toString());
		System.out.println("Box 2"+ b2.toString());

	}

}
