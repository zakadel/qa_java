package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    public LionTest() throws Exception {
    }

    @Test
    public void sexCheckMale() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex);
        Assert.assertTrue(lion.hasMane);
    }

    @Test
    public void sexCheckFemale() throws Exception {
        String sex = "Самка";
        Lion lion = new Lion(sex);
        Assert.assertFalse(lion.hasMane);
    }

    @Test
    public void verificationOfIndeterminateGender() {
        String sex = "Тест";
        Assertions.assertThrows(Exception.class, () -> new Lion(sex));
    }

    @Mock
    Feline feline;

    @Test
    public void test() throws Exception {
        Lion lion = new Lion("Самец");
        Mockito.when(feline.getKittens()).thenReturn(3);
        int expectedResult = 0;
        int actualResult = lion.getKittens();
        Assert.assertEquals(expectedResult, actualResult);
    }

}
