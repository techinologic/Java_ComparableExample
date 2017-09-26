package genericinterfaceexample;

/**
 * Created by Paolo T. Inocencion on 09/26/17.
 */
public class GenericList<T> implements GenericInterface<T> {
    public T myList;

    public void add(T t) {
        myList = t;
    }

    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("Good afternoon");
        System.out.println(list.myList.toString());
    }
}
