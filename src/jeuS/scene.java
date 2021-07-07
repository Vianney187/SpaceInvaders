package jeuS;

import Ressources.constantes;

import javax.swing.*;
import java.awt.*;

public class scene extends JPanel {

    // VARIABLE


    //CONSTANTE

    public scene(){
        super();
    }


    //METHODES


    /**
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics g2 = (Graphics2D) g;

        //FOND D'ECRAN
        g2.setColor(Color.white);
        g2.fillRect(0, 0, constantes.LARGEUR_FENETRE, constantes.HAUTEUR_FENETRE);

        //BASE DE NOTRE ECRAN
        g2.setColor(Color.blue);
        g2.fillRect(30,530,5 ,50);
    }
}
