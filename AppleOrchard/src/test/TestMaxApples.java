package test;

import org.junit.Test;
import solution.ApplesOrchard;

import static junit.framework.TestCase.assertEquals;

public class TestMaxApples {
    ApplesOrchard applesorchard=new ApplesOrchard();
    @Test
    public void testMax1()
    {
        int A[]={6, 1, 4, 6, 3, 2, 7, 4};
        int k=3;
        int l=2;
        assertEquals(24, applesorchard.findMaximumApples(A,k,l));
    }
    @Test
    public void testMax2()
    {
        int A[]={1,2,3,4,5};
        int k=3;
        int l=2;
        assertEquals(15, applesorchard.findMaximumApples(A,k,l));
    }
    @Test
    public void testMax3()
    {
        int A[]={10, 19, 15};
        int k=2;
        int l=2;
        assertEquals(-1, applesorchard.findMaximumApples(A,k,l));
    }
}
