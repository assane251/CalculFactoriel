package gm.rahmanproperties;

// Function to calcul factoriel
public abstract class CalculFactoriel {
    public static int calculateFactoriel(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * calculateFactoriel(x - 1);
    }
}
