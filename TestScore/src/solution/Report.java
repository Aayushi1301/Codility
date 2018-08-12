package solution;

import java.util.HashMap;
import java.util.Map;

public class Report {

    /**
     *
     * @param T test cases
     * @param R result of each test case
     * @return the score of user given the test cases
     */
    public int getScore(String T[], String R[]) {

        //create a hashmap to store the score
        Map<String, Boolean> scoreMap = new HashMap<>();

        //calculating score for each test case
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length(); j++) {
                int ch = T[i].charAt(j);
                if (ch >= 48 && ch <= 57) {
                    String prefix = T[i].substring(0, j + 1);

                    if (scoreMap.getOrDefault(prefix, true) && R[i].equals("OK")) {
                        scoreMap.put(prefix, true);
                    } else {
                       scoreMap.put(prefix, false);
                    }
                }
            }
        }

        //calculating total number of passed test case
        int count = 0;
        for (String prefix : scoreMap.keySet()) {
            if (scoreMap.get(prefix)) {
                count++;
            }
        }

        //calculating the score
        int score = (int)(count * 100) /scoreMap.size();
        return score;
    }
}