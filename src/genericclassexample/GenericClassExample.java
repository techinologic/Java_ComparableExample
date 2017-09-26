package genericclassexample;

/**
 * Created by Paolo T. Inocencion on 09/26/17.
 */
public class GenericClassExample {

    public static void main(String[] args) {

        Person<Employee> e1 = new Person<>();
        Person<Contact> c1 = new Person<>();

        Employee e = new Employee("John", "Slattery", "12345");
        Contact c = new Contact("Mrs", "Peggy",
                "Fisher", "441-414-1441");

        e1.setPerson(e);
        c1.setPerson(c);

        System.out.println(e1.getPerson().toString());
        System.out.println(c1.getPerson().toString());
    }
}
