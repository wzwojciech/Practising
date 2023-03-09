package org.example;

import org.junit.Assert;
import org.junit.Test;


public class ExampleTest {
    @Test
    public void testExample(){
        //Given
        Example example = new Example("Wojtek");

        //When
        String finalResult = example.getExample();

        //Then
        Assert.assertEquals("Wojtek", finalResult);


    }
}
