package shape;

class Circle extends Shape implements Printable{
	
	public Circle() {
		//super("Blue");
		System.out.println("Circle Created");
	}
	public Circle(String color) {
		super(color);
		System.out.println("Circle created with Color");
	}
	public void draw() {
		System.out.println("Drawing a Circle");
	}
	//Book b=new Book();
	public void print() {
		System.out.println("Circle is Printed");
	}
}
class Rectangle extends Shape implements Printable{
	public Rectangle() {
		System.out.println("Rectangle Created");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Rectangle"); 
	}
	public void print() {
		System.out.println("Rectangle is Printed");
	}
	public int area(int length,int breadth) {
		return length*breadth;
	}
}
public class AbstractDemo {

	private static Printable[] shape;

	public static void main(String[] args) {
      	Shape[] shapes=new Shape[5];
      	shapes[0]=new Circle();
      	shapes[1]=new Circle();
      	shapes[2]=new Rectangle();
      	shapes[3]=new Circle();
      	shapes[4]=new Rectangle();
      	for(Printable s:shape) {
      		s.print();
      	}
	}

}

