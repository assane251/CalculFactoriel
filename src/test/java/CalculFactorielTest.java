import gm.rahmanproperties.CalculFactoriel;
import org.junit.Test;

import static gm.rahmanproperties.CalculFactoriel.calculateFactoriel;
import static org.junit.Assert.assertEquals;

public class CalculFactorielTest {
    @Test
    public void testCalculateFactoriel() {
        int nombre = 5;
        int calculateFactoriel = CalculFactoriel.calculateFactoriel(nombre);
        assertEquals(120, calculateFactoriel(5));
    }
}
