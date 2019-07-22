/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patepeli;

import java.util.Random;

/**
 *
 * @author Käyttäjä 2
 */
public class Patepeli {

    private Ikkuna begin;

    public static void main(String[] args) {

        Ikkuna kayttis = new Ikkuna();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                kayttis.setVisible(true);
            }
        }
        );

    }
}
