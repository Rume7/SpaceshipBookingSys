package io.turntabl.belief;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MartianBeliefTest {

    private Belief belief;

    @Test
    void testMartianPlutoBelief() {
        belief = new MartianBelief();
        assertEquals("Pluto is a planet", belief.plutoBelief());
    }

    @Test
    void testMartianPlutoBeliefWithMock() {
        Belief bf = mock(Belief.class);
        String martianBelief = "Pluto is a planet";
        when(bf.plutoBelief()).thenReturn(martianBelief);
        assertEquals(bf.plutoBelief(), martianBelief);
    }
}