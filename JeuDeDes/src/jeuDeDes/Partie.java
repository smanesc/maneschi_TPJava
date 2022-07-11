package jeuDeDes;

import java.util.Scanner;

public class Partie {
    private int nb_tours;
    private Gobelet gobelet;
    private Joueur joueurs[];

    /**
     * Constructeur permettant d'initialiser le gobelet de la partie
     * et le nombre de tours joués pendant la partie
     * @param nb_tours Nombre de tours joués
     * @param nb_des Nombre de dés utilisés pour la partie
     */
    public Partie(int nb_tours, int nb_des) {
        this.nb_tours = nb_tours;
        this.gobelet = new Gobelet(nb_des);
    }

    /**
     * Inscrire les joueurs dans la partie
     * Demande le nombre de joueurs et les noms de chacun
     * On vérifie que le nombre de joueurs est au minimum de 2
     */
    public void initialiser() {
        Scanner objScanner = new Scanner(System.in);
        int nbJoueurs;

        // Saisie du nombre de joueurs avec contrôle sur le nombre saisi
        do {
            System.out.println("Combien de joueurs veulent rejoindre la partie (minimum 2 personnes requises) ? ");
            nbJoueurs = objScanner.nextInt();
        } while (nbJoueurs < 2);

        this.joueurs = new Joueur[nbJoueurs];
        for (int i = 0; i < nbJoueurs; i++) {
            System.out.println("Nom du nouveau joueur ?");
            String nomJoueur = objScanner.next();
            joueurs[i] = new Joueur(nomJoueur);
        }
    }

    /**
     * Compare les scores joueurs et affiche le nom du gagnant
     * et son score
     */
    public void afficher_gagnant() {
        int maxScore = 0;
        String gagnant = "";
        for (Joueur joueur : this.joueurs) {
            if (joueur.get_score() > maxScore) {
                maxScore = joueur.get_score();
                gagnant = joueur.get_nom();
            }
        }
        System.out.println("Le gagnant de la partie est " + gagnant + ", avec un score de : " + maxScore);
    }

    /**
     * Lancer la partie
     * Chaque joueur joue à tour de rôle pendant les nb_tours
     * Le gagnant est affiché à la fin de la partie
     * Affichage des numéros de tour et scores des joueurs (plus "visuel" pour l'utilisateur)
     */
    public void lancer() {

        int i = 1;
        while (i <= this.nb_tours) {
            System.out.println("\n<<<<<<<<<<<<<<<<< Tour " + i + " >>>>>>>>>>>>>>>>>>");
            for (Joueur joueur : this.joueurs) {
                System.out.println("========== Joueur " + joueur.get_nom() + " ==========");
                joueur.jouer(this.gobelet);
                System.out.println("Score : " + joueur.get_score());
            }
            i++;
        }
        afficher_gagnant();
    }

}
