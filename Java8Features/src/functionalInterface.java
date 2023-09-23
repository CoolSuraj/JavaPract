import com.suraj.functionalinterfaces.BasicFunctionalInterface;
import com.suraj.functionalinterfaces.FunctionalInterfacesWithTwoParams;

public class functionalInterface {
	public static void main(String[] args) {
		/* Functional Interface is the one which contains single  method
		 * (it should be abstract)
		 * @FunctionalInterface is annotation for declaring interface as functional Interface
		 * now using functional interface and lambda we will try to print hello and do small calculations
		 * */
		
		BasicFunctionalInterface bfi = ()-> System.out.println("Hello World!!");
		bfi.key();
		
		FunctionalInterfacesWithTwoParams g = (a,b)-> System.out.println(a+b);
		g.calc(3, 5);
		
		FunctionalInterfacesWithTwoParams h = (a,b)-> {
			a=a+b;
			b=a+b;
			System.out.println(a+b);
		};
		h.calc(1, 1);
	}

}
