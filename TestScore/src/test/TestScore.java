package test;

import org.junit.Test;
import solution.Report;

import static org.junit.Assert.assertEquals;

public class TestScore {

    Report report = new Report();
    @Test
    public void checkScore1()
    {
        String T[] = {"test1a", "test2", "test1b", "test1c", "test3"};
        String R[] = {"Wrong answer", "OK", "Runtime Error", "OK", "Time Limit Exceeded"};
        assertEquals(33, report.getScore(T, R));
    }
    @Test
    public void checkScore2()
    {
        String T[] = {"codility1", "codility3", "codility2", "codility4b", "codility4a"};
        String R[] = {"Wrong answer", "OK", "OK", "Runtime Error", "OK"};
        assertEquals(50, report.getScore(T, R));
    }
    @Test
    public void checkScore3()
    {
        String T[] = {"test1a", "test2a", "test1b", "test1c", "test2b"};
        String R[] = {"Wrong answer", "OK", "", "Runtime Error", "Time Limit Exceeded"};
        assertEquals(0, report.getScore(T, R));
    }

}
