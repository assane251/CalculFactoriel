import gm.rahmanproperties.CalculFactoriel;

import static gm.rahmanproperties.CalculFactoriel.calculateFactoriel;
import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void testCalculateFactoriel() {
        int nombre = 5;
        int calculateFactoriel = CalculFactoriel.calculateFactoriel(nombre);
        assertEquals(120, calculateFactoriel(5));
    }
}
