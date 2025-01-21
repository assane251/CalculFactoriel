package gm.rahmanproperties;


public abstract class CalculFactoriel {
    /**
     * Cette méthode prend un entier comme paramètre et renvoie sa factorielle.
     * <p>
     * La factorielle d'un nombre est le produit de tous les entiers positifs inférieurs ou égaux à ce nombre.
     * <p>
     * Par exemple, la factorielle de 5 (notée 5!) est 1*2*3*4*5 = 120.
     * <p>
     * Cette méthode utilise la récursion pour calculer la factorielle.
     * <p>
     * @param x le nombre dont on veut calculer la factorielle
     * @return la factorielle de x
     */
    public static int calculateFactoriel(int x) {
        return x == 0 || x == 1 ? 1 : x * calculateFactoriel(x - 1);
    }
}
