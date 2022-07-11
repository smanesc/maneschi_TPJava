package jeuDeDes;

public class Gobelet {
    private int valeurGobelet;
    private De des[];

    /**
     * Constructeur avec 1 argument permettant d'initialiser le nombre de dés d'une partie
     * et la valeur du gobelet à 0
     */
    public Gobelet(int nb_des) {
        this.valeurGobelet = 0;

        this.des = new De[nb_des];
        for (int i = 0; i < nb_des; i++) {
            this.des[i] = new De();
        }
    }

    /**
     * Getter
     * @return Valeur du gobelet
     */
    public int get_valeur() {
        return(this.valeurGobelet);
    }

    /**
     * Méthode permettant d'afficher le score du dernier lancé de gobelet
     */
    public void afficher_score() {
        System.out.println("Le score du dernier lancé est : " + this.valeurGobelet);
    }

    /**
     * Méthode permettant de lancer les dés du gobelet
     * et met à jour la valeur du gobelet.
     * Et affichage du score
     */
    public void lancer() {
        int valGobelet = 0;

        for (De de : this.des) {
            de.lancer();
            valGobelet += de.get_valeur();
        }
        this.valeurGobelet = valGobelet;

        afficher_score();
    }
}
