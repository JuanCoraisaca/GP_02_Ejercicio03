/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.g02_ejercicio_03;

/**
 *
 * @author usuario
 */
public class VentanaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var v1 = new Ventana01Border("Border Layout");
        var v2 = new Ventana02Grid("GridLayout");
        var v3 = new Ventana03Flow("FlowLayout");
        var v4 = new Ventana04Bandera("Border Layout");
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
    }
    
}
