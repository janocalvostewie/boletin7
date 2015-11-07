package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin7_4 {
    public static void main(String[] args) {
        //ENTRADA DE DATOS CON CREACIÓN DE OBJETOS
        Persona primeraPersona=new Persona(JOptionPane.showInputDialog("Nombre:"), Float.parseFloat(JOptionPane.showInputDialog("Teclea el peso:")));
        Persona segundaPersona=new Persona(JOptionPane.showInputDialog("Nombre:"), Float.parseFloat(JOptionPane.showInputDialog("Teclea el peso:")));
    
        //CONDICIONES
        if(primeraPersona.getPeso()>segundaPersona.getPeso()){
            primeraPersona.llamarFicha();
            JOptionPane.showMessageDialog(null, primeraPersona.getNombre()+" pesa "+(primeraPersona.getPeso()-segundaPersona.getPeso())+" kilos más");
        }
        else if(primeraPersona.getPeso()==segundaPersona.getPeso()){
            JOptionPane.showMessageDialog(null, "Ambas personas pesan igual");
            primeraPersona.llamarFicha();
            segundaPersona.llamarFicha();
        }
        else{
            segundaPersona.llamarFicha();
            JOptionPane.showMessageDialog(null, segundaPersona.getNombre()+" pesa "+(segundaPersona.getPeso()-primeraPersona.getPeso())+" kilos más");
        
        }
    }
}
