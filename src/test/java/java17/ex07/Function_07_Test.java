package java17.ex07;

import java.util.function.IntBinaryOperator;

import org.junit.Test;

/**
 * Exercice 07 - java.util.function.IntBinaryOperator
 */
public class Function_07_Test {

    // tag::format[]
    String format(int nb1, int nb2, String symbol, IntBinaryOperator operator) {
        int result = operator.applyAsInt(nb1,nb2);
        return String.format("(%d%s%d)=%d", nb1,symbol,nb2,result);
    }
    // end::format[]
    IntBinaryOperator sum = (a,b) -> a + b;

    @Test
    public void test_format_sum() throws Exception {

        String result = format(12, 13, "+", sum);

        assert result.equals("(12+13)=25");
    }

    IntBinaryOperator substract = (a,b) -> a - b ;

    @Test
    public void test_format_subtract() throws Exception {

        String result = format(2, 3, "-", substract);

        assert result.equals("(2-3)=-1");
    }
}