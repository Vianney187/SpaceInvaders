package Ressources;

import jeuS.Main;

public class Chrono implements Runnable {

    // VARIABLE
    private final int PAUSE = 5; // Temps d'ayyenye entre deux tours de boucle
    public  static int compteTours = 0;


    // Methodes

    public void run(){
        while(true){
            Main.piste.repaint();

            try{
                Thread.sleep(PAUSE);
            }catch (InterruptedException e){

            }
        }
    }
}
