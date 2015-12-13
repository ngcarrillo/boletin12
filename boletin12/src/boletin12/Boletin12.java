/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author nuria
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    garaxe garaxe1 = new garaxe();
    garaxe1.calcularPrecio();
    int numCoches = 0;
    int aparcar = Integer.parseInt(JOptionPane.showInputDialog("Si quieres aparcar pulsa 1 si te vas pulsa 2"));
    
    switch (aparcar){
        case 1:
            garaxe1.comprobarPlazas(numCoches);
            numCoches ++;
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "O importe a pagar é" +garaxe1.calcularPrecio());
            JOptionPane.showMessageDialog(null, "A matricula do vehiculo é "+garaxe1.matricula());
            JOptionPane.showMessageDialog(null, "O numero de horas que ha estado aparcado é: " );
            numCoches--;
    }
    
    }
    
}
