package io.turntabl.belief;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class HumanBeliefTest {

    private Belief belief;

    @Test
    void testHumanPlutoBelief() {
        belief = new HumanBelief();
        assertEquals("Pluto is a Moon", belief.plutoBelief());
    }

    @Test
    void testHumanPlutoBeliefWithMock() {
        Belief bf = mock(Belief.class);
        String humanBelief = "Pluto is a Moon";
        when(bf.plutoBelief()).thenReturn(humanBelief);
        assertEquals(bf.plutoBelief(), humanBelief);
    }
}