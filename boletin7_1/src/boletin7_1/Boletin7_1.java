package boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin7_1 {
    public static void main(String[] args) {
       //ENTRADA DE DATOS
        float num1=Float.parseFloat(JOptionPane.showInputDialog("Teclea el primer número:"));
       
       
       //CONDICIÓN
       if (num1>0){
           JOptionPane.showMessageDialog(null, "El número es positivo: "+num1);
       }
    }
    
}
