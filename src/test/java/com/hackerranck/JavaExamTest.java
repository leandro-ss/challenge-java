package com.hackerranck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JavaExamTest{
    
    @Test
    public void testA() {

        Assertions.assertEquals("Yes", new JavaExam().isPossible(1, 4, 5, 9));
        
    }

    // @Test
    // public void testB() {

    //     assertEquals("Yes", new JavaExam().isPossible(1, 2, 3, 6));
        
    // }
}
