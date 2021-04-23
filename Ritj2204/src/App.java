import com.pract.rit.B;
import com.pract.rit2.A;
import com.pract.rit3.Motorcycle;
import com.pract.rit3.*;

public class App {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.show();

        // from rit2 class
        A a2 = new A(40, 4);
        System.out.println(a2.addition(a2.a, a2.b));
        System.out.println(a2.subtraction(a2.a, a2.b));
        System.out.println(a2.multiplication(a2.a, a2.b));
        System.out.println(a2.division(a2.a, a2.b));

        // from rit3 class
        Motorcycle mco = new old_bike();
        mco.start();
        mco.have_tyers();

        Motorcycle mcn = new new_bike();
        mcn.start();
        mcn.have_tyers();
    }
}
