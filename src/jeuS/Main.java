package jeuS;

import Ressources.constantes;

import javax.swing.*;

public class Main {
    public static DefaultListCellRenderer piste;

    public static void main(String[] args) {

        // creation de la fenetre de l'application

        JFrame fenetre = new JFrame("jeu style Space invaders");
        fenetre.setSize(constantes.LARGEUR_FENETRE, constantes.HAUTEUR_FENETRE);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setAlwaysOnTop(true);

        // Association du paramettre de l'ecran a la scene
        scene piste = new scene();
        fenetre.setContentPane(piste);

        fenetre.setVisible(true);

    }
}
