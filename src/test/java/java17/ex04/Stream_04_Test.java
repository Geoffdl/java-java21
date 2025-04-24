package java17.ex04;


import org.junit.Test;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 04 - Stream
 */
public class Stream_04_Test
{

    @Test
    public void test_of() throws Exception
    {
        // Construire un stream permettant de rendre le test passant
        Stream<String> result = Stream.<String>builder().add("Alexandra").add("Cyril").add("Johnny").add("Marion").add("Sophie").build();

        assertThat(result.toArray(), arrayContaining("Alexandra", "Cyril", "Johnny", "Marion", "Sophie"));
    }

    @Test
    public void test_builder() throws Exception
    {

        Stream<Object> result = Stream.builder().add("Alexandra").add("Cyril").add("Johnny").add("Marion").add("Sophie")
                .build();

        assertThat(result.toArray(), arrayContaining("Alexandra", "Cyril", "Johnny", "Marion", "Sophie"));
    }

    @Test
    public void test_concat() throws Exception
    {
        Stream<String> s1 = Stream.of("Alexandra", "Cyril");
        Stream<String> s2 = Stream.of("Johnny", "Marion", "Sophie");

        Stream<String> result = Stream.concat(s1, s2);

        assertThat(result.toArray(), arrayContaining("Alexandra", "Cyril", "Johnny", "Marion", "Sophie"));
    }

    @Test
    public void test_iterate() throws Exception
    {
        Stream<Integer> result1 = Stream.iterate(1, integer -> 1).limit(5);
        Stream<Integer> result2 = Stream.iterate(1, integer -> integer + 1).limit(5);
        assertThat(result1.toArray(), arrayContaining(1, 1, 1, 1, 1));
        assertThat(result2.toArray(), arrayContaining(1, 2, 3, 4, 5));
    }
}