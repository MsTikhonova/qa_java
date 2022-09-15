package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void isEatMeatCallsAnimal() throws Exception {
        Feline feline = new Feline();
        Feline spyFeline = Mockito.spy(feline);
        List<String> amazingList = List.of("kurwa bobr", "kurwa jezyk", "kurwa dzik");
        Mockito.when(spyFeline.getFood("Хищник")).thenReturn(amazingList);
        List<String> food = spyFeline.eatMeat();
        assertEquals(amazingList, food);
    }

    @Test
    public void isGetFamilyReturn() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    public void isGetKittensReturnOne() {
        Feline feline = new Feline();
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void isGetKittensReturnkittensCount() {
        Feline feline = new Feline();
        int kittens = feline.getKittens(3);
        assertEquals(3, kittens);
    }
}
