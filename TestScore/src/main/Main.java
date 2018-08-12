package main;

import solution.Report;

class Main {
    public static void main(String[] args) throws java.lang.Exception {

        //initialization
        String T[] = {"test1a", "test2", "test1b", "test1c", "test3"};
        String R[] = {"Wrong answer", "OK", "Runtime Error", "OK", "Time Limit Exceeded"};

        //solution
        Report report = new Report();
        int score = report.getScore(T, R);
        System.out.println(score);
    }
}