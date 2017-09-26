package genericclassexample;

/**
 * Created by Paolo T. Inocencion on 09/26/17.
 */
public class Person<E> {
    public E e;

    public void setPerson(E e) {
        this.e = e;
    }

    public E getPerson() {
        return e;
    }
}
