import gm.rahmanproperties.CalculFactoriel;
import org.junit.Test;

import static gm.rahmanproperties.CalculFactoriel.calculateFactoriel;
import static org.junit.Assert.assertEquals;

public class CalculFactorielTest {

    @Test



    public void testCalculateFactoriel_Zero() {
        int calculateFactoriel = CalculFactoriel.calculateFactoriel(0);
        assertEquals(1, calculateFactoriel);
    }

    @Test
    public void testCalculateFactoriel_One() {
        int calculateFactoriel = CalculFactoriel.calculateFactoriel(1);
        assertEquals(1, calculateFactoriel);
    }

    @Test
    public void testCalculateFactoriel() {
        int calculateFactoriel = CalculFactoriel.calculateFactoriel(5);
        assertEquals(120, calculateFactoriel(5));
    }
}


