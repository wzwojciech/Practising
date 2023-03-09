package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void resultCalculateTest() {
        //Given
        Scores scores = mock(Scores.class);
        HashMap<Integer, Double> scoresMap = new HashMap<>();
        scoresMap.put(2, 2.3);
        scoresMap.put(4, 2.5);
        scoresMap.put(5, 3.3);
        scoresMap.put(6, 2.2);

        when(scores.getScores()).thenReturn(scoresMap);

        Calculator calculator = new Calculator(scores);

        //When

        int finalResult = calculator.calculateResults().size();

        //Then
        Assert.assertEquals(4, finalResult);

    }

}
