package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static arrays.ComputePascalsTriangle.generatePascalTriangle;
import static org.junit.jupiter.api.Assertions.*;

class ComputePascalsTriangleTest {

    private List<List<Integer>> expected;
    private int n;

    @Test
    void generatePascalTriangle1() {
        expected = Arrays.asList(
                Arrays.asList(1)
        );
        n = 1;

        test(expected, n);
    }

    @Test
    void generatePascalTriangle2() {
        expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1)
        );
        n = 2;

        test(expected, n);
    }

    @Test
    void generatePascalTriangle3() {
        expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1)
        );
        n = 3;

        test(expected, n);
    }

    @Test
    void generatePascalTriangle4() {
        expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1)
        );
        n = 4;

        test(expected, n);
    }

    @Test
    void generatePascalTriangle5() {
        expected = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1,1),
                Arrays.asList(1,2,1),
                Arrays.asList(1,3,3,1),
                Arrays.asList(1,4,6,4,1)
        );
        n = 5;

        test(expected, n);
    }

    private void test(List<List<Integer>> expected, int n) {
        assertEquals(expected, generatePascalTriangle(n));
    }

}