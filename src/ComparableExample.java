import java.util.Date;

/**
 * Created by Paolo T. Inocencion on 09/25/17.
 */
public class ComparableExample {

    public static void main(String[] args) {
//        Comparable c = new Date();
//        System.out.println(c.compareTo("Monday"));

        // error caught in compile time instead of runtime above
        Comparable<Date> c2 = new Date();
        System.out.println(c2.compareTo("Monday"));
    }
}
