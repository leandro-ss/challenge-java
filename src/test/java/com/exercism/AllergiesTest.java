package com.exercism;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class AllergiesTest {

    @Test
    public void noAllergiesMeansNotAllergicToAnything() {
        Allergies allergies = new Allergies(0);

        Assertions.assertFalse(allergies.isAllergicTo(Allergen.PEANUTS));
        Assertions.assertFalse(allergies.isAllergicTo(Allergen.CATS));
        Assertions.assertFalse(allergies.isAllergicTo(Allergen.STRAWBERRIES));
    }

    @Test
    public void allergicToEggs() {
        Allergies allergies = new Allergies(1);

        Assertions.assertTrue(allergies.isAllergicTo(Allergen.EGGS));
    }

    @Test
    public void allergicToEggsInAdditionToOtherStuff() {
        Allergies allergies = new Allergies(5);

        Assertions.assertTrue(allergies.isAllergicTo(Allergen.EGGS));
        Assertions.assertTrue(allergies.isAllergicTo(Allergen.SHELLFISH));
        Assertions.assertFalse(allergies.isAllergicTo(Allergen.STRAWBERRIES));
    }

    @Test
    public void noAllergies() {
        Allergies allergies = new Allergies(0);

        Assertions.assertEquals(0, allergies.getList().size());
    }

    @Test
    public void isAllergicToJustEggs() {
        Allergies allergies = new Allergies(1);
        List<Allergen> expectedAllergens = Collections.singletonList(Allergen.EGGS);

        Assertions.assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    public void isAllergicToJustPeanuts() {
        Allergies allergies = new Allergies(2);
        List<Allergen> expectedAllergens = Collections.singletonList(Allergen.PEANUTS);

        Assertions.assertEquals(expectedAllergens, allergies.getList());
    }

    @Test
    public void isAllergicToJustStrawberries() {
        Allergies allergies = new Allergies(8);
        List<Allergen> expectedAllergens = Collections.singletonList(Allergen.STRAWBERRIES);

        Assertions.assertEquals(expectedAllergens, allergies.getList());
    }

    // @Test
    // public void isAllergicToEggsAndPeanuts() {
    //     Allergies allergies = new Allergies(3);
    //     List<Allergen> expectedAllergens = Arrays.asList(
    //             Allergen.EGGS,
    //             Allergen.PEANUTS
    //     );

    //     assertEquals(expectedAllergens, allergies.getList());
    // }

    // @Test
    // public void isAllergicToEggsAndShellfish() {
    //     Allergies allergies = new Allergies(5);
    //     List<Allergen> expectedAllergens = Arrays.asList(
    //             Allergen.EGGS,
    //             Allergen.SHELLFISH
    //     );

    //     assertEquals(expectedAllergens, allergies.getList());
    // }

    // @Test
    // public void isAllergicToLotsOfStuff() {
    //     Allergies allergies = new Allergies(248);
    //     List<Allergen> expectedAllergens = Arrays.asList(
    //             Allergen.STRAWBERRIES,
    //             Allergen.TOMATOES,
    //             Allergen.CHOCOLATE,
    //             Allergen.POLLEN,
    //             Allergen.CATS
    //     );

    //     assertEquals(expectedAllergens, allergies.getList());
    // }

    // @Test
    // public void isAllergicToEverything() {
    //     Allergies allergies = new Allergies(255);
    //     List<Allergen> expectedAllergens = Arrays.asList(
    //             Allergen.EGGS,
    //             Allergen.PEANUTS,
    //             Allergen.SHELLFISH,
    //             Allergen.STRAWBERRIES,
    //             Allergen.TOMATOES,
    //             Allergen.CHOCOLATE,
    //             Allergen.POLLEN,
    //             Allergen.CATS
    //     );

    //     assertEquals(expectedAllergens, allergies.getList());
    // }

    // @Test
    // public void ignoreNonAllergenScoreParts() {
    //     Allergies allergies = new Allergies(509);
    //     List<Allergen> expectedAllergens = Arrays.asList(
    //             Allergen.EGGS,
    //             Allergen.SHELLFISH,
    //             Allergen.STRAWBERRIES,
    //             Allergen.TOMATOES,
    //             Allergen.CHOCOLATE,
    //             Allergen.POLLEN,
    //             Allergen.CATS
    //     );

    //     assertEquals(expectedAllergens, allergies.getList());
    // }
}
