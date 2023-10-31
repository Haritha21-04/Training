
public class Exceptiondemo {

 

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a,b,c=0;

		try {

		a=Integer.parseInt(args[0]);

		b=Integer.parseInt(args[1]);

		c=a/b;

		}

		catch(ArrayIndexOutOfBoundsException ex) {

			System.out.println("not found");

		}

		catch(ArithmeticException ex) {

			System.out.println("second is zero");

		}

		catch(Exception ex) {

			System.out.println(ex.getMessage());

		}

		System.out.println("process completed");

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			

			e.printStackTrace();//print root cause of the error

		}

		System.out.println(c);

 

	}

 

}