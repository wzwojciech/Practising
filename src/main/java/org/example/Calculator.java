package org.example;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    Scores scores;

    public Calculator(Scores scores) {
        this.scores = scores;
    }

    public HashMap<Integer, Double> calculateResults(){
        HashMap<Integer, Double> resultMap = new HashMap<>();

        for (Map.Entry<Integer, Double> entry : scores.getScores().entrySet()){
            resultMap.put(entry.getKey(), entry.getValue() + 1);
        }

        return resultMap;
    }

}

