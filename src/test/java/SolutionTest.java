import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[][] mat = {
                {1,0,0},
                {0,0,1},
                {1,0,0}
        };
        int expected = 1;
        int actual = new Solution().numSpecial(mat);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[][] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int expected = 3;
        int actual = new Solution().numSpecial(mat);

        Assert.assertEquals(expected, actual);
    }
}
