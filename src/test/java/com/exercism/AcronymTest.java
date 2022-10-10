package com.exercism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AcronymTest {

    @Test
    public void basic() {
        final String phrase = "Portable Network Graphics";
        final String expected = "PNG";
        Assertions.assertEquals(expected, new Acronym(phrase).get());
    }

    @Test
    public void lowercaseWords() {
        final String phrase = "Ruby on Rails";
        final String expected = "ROR";
        Assertions.assertEquals(expected, new Acronym(phrase).get());
    }

    @Test
    public void punctuation() {
        final String phrase = "First In, First Out";
        final String expected = "FIFO";
        Assertions.assertEquals(expected, new Acronym(phrase).get());
    }

    @Disabled
    @Test
    public void NonAcronymAllCapsWord() {
        final String phrase = "GNU Image Manipulation Program";
        final String expected = "GIMP";
        Assertions.assertEquals(expected, new Acronym(phrase).get());
    }

    @Disabled
    @Test
    public void punctuationWithoutWhitespace() {
        final String phrase = "Complementary metal-oxide semiconductor";
        final String expected = "CMOS";
        Assertions.assertEquals(expected, new Acronym(phrase).get());
    }
}
