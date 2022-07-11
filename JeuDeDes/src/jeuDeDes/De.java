package jeuDeDes;

import java.util.Random;

public class De implements InterfaceLancer {
    private int valeur;

    /**
     * Constructeur sans arguments
     * valeur est initialisé à 0
     */
    public De() {
        this.valeur = 0;
    }

    /**
     * Getter
     * @return Valeur du dé
     */
    public int get_valeur() {
        return(this.valeur);
    }

    /**
     * Methode permettant de lancer un dé
     * Donne une valeur aléatoire comprise entre 1 et 6 à l'attribut valeur
     */
    public void lancer() {
        Random intRandom = new Random();
        this.valeur = intRandom.nextInt(1, 6);
    }

}
