/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import javax.swing.JOptionPane;

/**
 *
 * @author nuria
 */
public class calcular {
    private float num;
   
    
   public void sumar(){
   
       for (int i=10; i<=90; i++){
          num = num + i;
       }JOptionPane.showMessageDialog (null, "la suma es "+num);
   }
   
   public void multiplicar(){
       for (int i=10; i<=12; i++){
           num = num * i;
       }JOptionPane.showMessageDialog (null, "la multiplicacion es "+num);
   }
}
