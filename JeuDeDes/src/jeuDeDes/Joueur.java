package jeuDeDes;

public class Joueur implements InterfaceAfficherScore {
    private String nom;
    private int score;


    /**
     * Constructeur avec 1 argument pour initialiser le nom d'un joueur
     * et son score à 0
     * @param nom Nom du joueur
     */
    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    // ==== Getters ====

    /**
     * Getter permettant de retourner le nom du joueur
     * @return Nom du joueur
     */
    public String get_nom() {
        return(this.nom);
    }

    /**
     * Getter permettant de retourner le score du joueur
     * @return Score du joueur
     */
    public int get_score() {
        return(this.score);
    }

    /**
     * Méthode permettant de lancer le gobelet
     * et mettre à jour le score du joueur
     * @param gobelet Gobelet de la partie
     */
    public void jouer(Gobelet gobelet) {
        gobelet.lancer();
        this.score += gobelet.get_valeur();
    }

    /**
     * Méthode permettant d'afficher le score d'un joueur
     */
    public void afficher_score() {
        System.out.println("Le score du joueur " + this.nom + " est de : " + this.score);
    }


}
