package com.exercism;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {

    @Test
    public void testAnEmptyString() {
        assertEquals("", new ReverseString().reverse(""));
    }

    @Disabled
    @Test
    public void testAWord() {
        assertEquals("tobor", new ReverseString().reverse("robot"));
    }

    @Disabled
    @Test
    public void testACapitalizedWord() {
        assertEquals("nemaR", new ReverseString().reverse("Ramen"));
    }

    @Disabled
    @Test
    public void testASentenceWithPunctuation() {
        assertEquals("!yrgnuh m'I", new ReverseString().reverse("I'm hungry!"));
    }

    @Disabled
    @Test
    public void testAPalindrome() {
        assertEquals("racecar", new ReverseString().reverse("racecar"));
    }

}
