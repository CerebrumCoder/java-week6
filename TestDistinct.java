import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDistinct {
    @Test
    public void testDistinct() {
        int[] expected = {1,2,3,6,4,5};
        int[] result = Distinct.findDistinctNumber(new int[]{1,2,3,2,1,6,3,4,5,2});

        assertArrayEquals(expected, result);
    }
}
