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
public class garaxe {
    private int numCoches;
    private String matricula;
    private float horas;
    private double precio;
    private double dinero;
    private double vuelta;
    
public void comprobarPlazas(int numCoches){
   this.numCoches = numCoches; 
    if (numCoches<5){
        JOptionPane.showMessageDialog(null,"Hay plazas disponibles");
        matricula = JOptionPane.showInputDialog("Introduce a matricula");
}else {
    JOptionPane.showMessageDialog (null, "No quedan plazas");
    }
}

public String matricula(){
return matricula;
}

public float horasAparcado(){
horas = Float.parseFloat (JOptionPane.showInputDialog("Introduce numero de horas aparcado"));
return horas;
}

public double calcularPrecio(){
if (horas <=3){
    precio = horas * 1.5;    
}else if (horas > 3){
   float horasDist = horas - 3;
   precio = ((3*1.5) + (horasDist*0.20));
}
return precio;
}

public double pagar(){
dinero =Float.parseFloat(JOptionPane.showInputDialog ("Introduce con que cantidad vas a pagar"));
return dinero;
}

public double vuelta(){
    vuelta = dinero - precio;
    return vuelta;
}

public float horas (){
return horas;
}
public void desaparcar(){
numCoches = numCoches -1;
}
}
