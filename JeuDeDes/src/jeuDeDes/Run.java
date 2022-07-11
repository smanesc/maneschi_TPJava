package jeuDeDes;

public class Run {
    public static void main(String[] args) {

        // Test de lancement d'une partie
        Partie partie = new Partie(1, 5);

        // Initialiser les joueurs de la partie
        partie.initialiser();

        // Lancer une partie
        partie.lancer();

    }
}
