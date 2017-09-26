package genericmethodexample;

/**
 * Created by Paolo T. Inocencion on 09/26/17.
 */
public class GenericMethodExample {

    public static void main(String[] args) {
        Integer[] ints = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        print(ints);
        print(daysOfWeek);

        System.out.println(countGreaterThan(ints,50));
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] list, T elem) {
        int count = 0;

        for (T element :
                list) {
            if (element.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }

    public static <E> void print(E[] list) {
        for (E ele :
                list) {
            System.out.print(ele+ " ");
        }
        System.out.println("");
    }
}
