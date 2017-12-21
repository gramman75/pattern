package pattern.strategy.java;

import static org.junit.Assert.*;

public class HandTest {

    Hand rock = new Hand(0);
    Hand scissor = new Hand(1);
    Hand paper = new Hand(2);

    @org.junit.Test
    public void getHand() {
        assertTrue(rock.toString().equals(rock.getHand(0).toString()));
    }

    @org.junit.Test
    public void isStrongerThan() {
        assertTrue(rock.isStrongerThan(scissor));
        assertTrue(scissor.isStrongerThan(paper));
        assertTrue(paper.isStrongerThan(rock));
    }

    @org.junit.Test
    public void isWeakerThan() {
        assertTrue(scissor.isWeakerThan(rock));
        assertTrue(rock.isWeakerThan(paper));
        assertTrue(paper.isWeakerThan(scissor));
    }
}