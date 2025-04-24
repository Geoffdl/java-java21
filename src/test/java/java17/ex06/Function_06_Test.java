package java17.ex06;


import java.util.function.Supplier;

import org.junit.Test;

import java17.data.Person;

/**
 * Exercice 06 - java.util.function.Supplier
 */
public class Function_06_Test {


    // tag::formatAge[]
    String formatAge(Supplier<Person> supplier) {
       Person person = supplier.get();
        return "[age=" + person.getAge()+"]";
    }
    // end::formatAge[]


    @Test
    public void test_supplier_formatAge() throws Exception {
        Person person = new Person("James", "Bond", 35, null);
        String result = formatAge(() -> person);

        assert result.equals("[age=35]");
    }

}