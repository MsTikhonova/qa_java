package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void isGetFoodCallsPredator() throws Exception {
        MockitoAnnotations.openMocks(this);
        List<String> amazingList = List.of("kurwa bobr", "kurwa jezyk", "kurwa dzik");
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(amazingList);
        List<String> food = cat.getFood();
        assertEquals(amazingList, food);
    }

    @Test
    public void isGetSoundReturnSound() {
        MockitoAnnotations.openMocks(this);
        Cat cat = new Cat(feline);
        String family = cat.getSound();
        assertEquals("Мяу", family);
    }
}
