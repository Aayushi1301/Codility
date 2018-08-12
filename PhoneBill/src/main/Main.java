package main;

import solution.PhoneBill;

public class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
        //initialization
        PhoneBill sol = new PhoneBill();
        String input = "00:01:07,400-234-090"+"\n"+
                "00:05:01,701-080-080"+"\n"+
                "00:05:00,400-234-090";
        int out = sol.getBill(input);

        //result
        System.out.println(out);
    }
}
