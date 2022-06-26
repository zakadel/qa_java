package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getQuantityKittens() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamilyOfAnimals() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
