package com.exercism;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AlphameticsTest {

    private static Logger logger = LoggerFactory.getLogger(AlphameticsTest.class);

    @Test
    public void testConstrunctor() throws UnsolvablePuzzleException {
        List<String> expectedFactors = new ArrayList<String>();
        expectedFactors.add("A");
        expectedFactors.add("B");
        Assertions.assertEquals(expectedFactors, new Alphametics("A + B == C").factors);

        String expectedProduct = new String("C");
        assertEquals(expectedProduct, new Alphametics("A + B == C").product);
    }

    @Test
    public void testInitCharacterMap() throws UnsolvablePuzzleException {
        Alphametics testAlphametics = new Alphametics("A + B == C");
        testAlphametics.initCharacterMap();
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        
        expected.put('A', null);
        expected.put('B', null);
        expected.put('C', null);

        assertEquals(expected, testAlphametics.map);
    }

    @Test
    public void testCalc() throws UnsolvablePuzzleException {
        Alphametics testAlphametics = new Alphametics("I + BB == ILL");
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        
        expected.put('I', 1);
        expected.put('B', 9);
        expected.put('L', 0);

        testAlphametics.map = expected;

        assertTrue(testAlphametics.calc(testAlphametics.product) == testAlphametics.calc(testAlphametics.factors));
    }

    @Test
    public void testCalc4Letters() throws UnsolvablePuzzleException {
        Alphametics testAlphametics = new Alphametics("AS + A == MOM");
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        
        expected.put('A', 9);
        expected.put('S', 2);
        expected.put('M', 1);
        expected.put('O', 0);

        testAlphametics.map = expected;
        
        assertTrue(testAlphametics.calc(testAlphametics.product) == testAlphametics.calc(testAlphametics.factors));
    }

    @Test
    public void testCalc6Letters() throws UnsolvablePuzzleException {
        Alphametics testAlphametics = new Alphametics("NO + NO + TOO == LATE");
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        
        expected.put('N', 7);
        expected.put('O', 4);
        expected.put('T', 9);
        expected.put('L', 1);
        expected.put('A', 0);
        expected.put('E', 2);

        testAlphametics.map = expected;

        logger.debug("testAlphametics.calc(testAlphametics.product):{}",testAlphametics.calc(testAlphametics.product));
        logger.debug("testAlphametics.calc(testAlphametics.factors):{}",testAlphametics.calc(testAlphametics.factors));
        
        assertEquals(testAlphametics.calc(testAlphametics.product), testAlphametics.calc(testAlphametics.factors));
    }

    // @Test
    // public void testCalcException() throws UnsolvablePuzzleException {
    //     expectedException.expect(NumberFormatException.class);

    //     Alphametics testAlphametics = new Alphametics("AS + A == MOM");

    //     LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        
    //     expected.put('A', 1);
    //     expected.put('S', 9);
    //     expected.put('M', 0);
    //     expected.put('O', 2);

    //     testAlphametics.map = expected;
        
    //     assertTrue(testAlphametics.calc(testAlphametics.product) == testAlphametics.calc(testAlphametics.factors));
    // }


    @Test
    public void testThreeLetters123() throws UnsolvablePuzzleException {
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('A', 1);
        expected.put('B', 2);
        expected.put('C', 3);

        assertEquals(expected, new Alphametics("A + B == C").solve());
    }

    @Test
    public void testThreeLetters199() throws UnsolvablePuzzleException {
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('I', 1);
        expected.put('B', 9);
        expected.put('L', 0);

        assertEquals(expected, new Alphametics("I + BB == ILL").solve());
    }    

    // @Test
    // public void testUniqueValue() throws UnsolvablePuzzleException {
    //     expectedException.expect(UnsolvablePuzzleException.class);
    //     new Alphametics("A == B").solve();
    // }

    // @Test
    // public void testLeadingZero() throws UnsolvablePuzzleException {
    //     expectedException.expect(UnsolvablePuzzleException.class);
    //     assertNull(new Alphametics("ACA + DD == BD").solve());
    // }

    @Test
    public void testFourLetters() throws UnsolvablePuzzleException {
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('A', 9);
        expected.put('S', 2);
        expected.put('M', 1);
        expected.put('O', 0);

        assertEquals(expected, new Alphametics("AS + A == MOM").solve());
    }

    @Test
    public void testSixLetters() throws UnsolvablePuzzleException {
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();

        expected.put('N', 7);
        expected.put('O', 4);
        expected.put('T', 9);
        expected.put('L', 1);
        expected.put('A', 0);
        expected.put('E', 2);

        assertEquals(expected, new Alphametics("NO + NO + TOO == LATE").solve());
    }

    @Test
    public void testSevenLetters() throws UnsolvablePuzzleException {
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('E', 4);
        expected.put('G', 2);
        expected.put('H', 5);
        expected.put('I', 0);
        expected.put('L', 1);
        expected.put('S', 9);
        expected.put('T', 7);

        assertEquals(expected, new Alphametics("HE + SEES + THE == LIGHT").solve());
    }

    @Test
    public void testEightLetters() throws UnsolvablePuzzleException {
        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('S', 9);
        expected.put('E', 5);
        expected.put('N', 6);
        expected.put('D', 7);
        expected.put('M', 1);
        expected.put('O', 0);
        expected.put('R', 8);
        expected.put('Y', 2);

        assertEquals(expected, new Alphametics("SEND + MORE == MONEY").solve());
    }

    // @Test
    // public void testTenLetters() throws UnsolvablePuzzleException {
    //     LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
    //     expected.put('A', 5);
    //     expected.put('D', 3);
    //     expected.put('E', 4);
    //     expected.put('F', 7);
    //     expected.put('G', 8);
    //     expected.put('N', 0);
    //     expected.put('O', 2);
    //     expected.put('R', 1);
    //     expected.put('S', 6);
    //     expected.put('T', 9);

    //     assertEquals(expected, new Alphametics("AND + A + STRONG + OFFENSE + AS + A + GOOD == DEFENSE").solve());
    // }

    // @Test
    // public void testTenLetters41Addends() throws UnsolvablePuzzleException {
    //     LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();

    //     expected.put('A', 1);
    //     expected.put('E', 0);
    //     expected.put('F', 5);
    //     expected.put('H', 8);
    //     expected.put('I', 7);
    //     expected.put('L', 2);
    //     expected.put('O', 6);
    //     expected.put('R', 3);
    //     expected.put('S', 4);
    //     expected.put('T', 9);

    //     assertEquals(expected, new Alphametics("THIS + A + FIRE + THEREFORE + FOR + ALL + HISTORIES + I + TELL + A + " +
    //             "TALE + THAT + FALSIFIES + ITS + TITLE + TIS + A + LIE + THE + TALE + OF + THE + LAST + FIRE + " +
    //             "HORSES + LATE + AFTER + THE + FIRST + FATHERS + FORESEE + THE + HORRORS + THE + LAST + FREE + " +
    //             "TROLL + TERRIFIES + THE + HORSES + OF + FIRE + THE + TROLL + RESTS + AT + THE + HOLE + OF + " +
    //             "LOSSES + IT + IS + THERE + THAT + SHE + STORES + ROLES + OF + LEATHERS + AFTER + SHE + SATISFIES + " +
    //             "HER + HATE + OFF + THOSE + FEARS + A + TASTE + RISES + AS + SHE + HEARS + THE + LEAST + FAR + " +
    //             "HORSE + THOSE + FAST + HORSES + THAT + FIRST + HEAR + THE + TROLL + FLEE + OFF + TO + THE + " +
    //             "FOREST + THE + HORSES + THAT + ALERTS + RAISE + THE + STARES + OF + THE + OTHERS + AS + THE + " +
    //             "TROLL + ASSAILS + AT + THE + TOTAL + SHIFT + HER + TEETH + TEAR + HOOF + OFF + TORSO + AS + THE + " +
    //             "LAST + HORSE + FORFEITS + ITS + LIFE + THE + FIRST + FATHERS + HEAR + OF + THE + HORRORS + THEIR + " +
    //             "FEARS + THAT + THE + FIRES + FOR + THEIR + FEASTS + ARREST + AS + THE + FIRST + FATHERS + " +
    //             "RESETTLE + THE + LAST + OF + THE + FIRE + HORSES + THE + LAST + TROLL + HARASSES + THE + FOREST + " +
    //             "HEART + FREE + AT + LAST + OF + THE + LAST + TROLL + ALL + OFFER + THEIR + FIRE + HEAT + TO + THE + " +
    //             "ASSISTERS + FAR + OFF + THE + TROLL + FASTS + ITS + LIFE + SHORTER + AS + STARS + RISE + THE + " +
    //             "HORSES + REST + SAFE + AFTER + ALL + SHARE + HOT + FISH + AS + THEIR + AFFILIATES + TAILOR + A + " +
    //             "ROOFS + FOR + THEIR + SAFE == FORTRESSES").solve());
    // }
}
