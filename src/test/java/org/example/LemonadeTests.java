package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LemonadeTests {
    @Test
    public void testCreateLemonade() {
        Lemonade lemonade = new Lemonade();
        assertEquals(4, lemonade.getLemons());
        assertEquals(2, lemonade.getSugar());
        assertEquals(3, lemonade.getIce());
    }

    @Test
    public void testCreateLemonadeWithArgs() {
        Lemonade lemonade = new Lemonade(5, 3, 4);
        assertEquals(5, lemonade.getLemons());
        assertEquals(3, lemonade.getSugar());
        assertEquals(4, lemonade.getIce());
    }

    @Test
    public void testGettersAndSetters() {
        Lemonade lemonade = new Lemonade();
        lemonade.setLemons(5);
        lemonade.setSugar(3);
        lemonade.setIce(4);
        assertEquals(5, lemonade.getLemons());
        assertEquals(3, lemonade.getSugar());
        assertEquals(4, lemonade.getIce());
    }

    @Test
    public void testMix() {
        String lemonade1 = new Lemonade(5, 3, 4).toString();
        Lemonade lemonade2 = new Lemonade(3, 2, 1);
        int lemonade3 = Lemonade.mix(lemonade1, String.valueOf(lemonade2));
        assertEquals(8, lemonade3);
        assertEquals(5, lemonade3);
        assertEquals(5, lemonade3);
    }
}
