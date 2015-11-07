package boletin7_3;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin7_3 {
    public static void main(String[] args) {
        //ENTRADA DE DATOS
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Teclea el primer número:"));
       
       //CONDICIÓN
       if (num1>0){
           JOptionPane.showMessageDialog(null, "El número "+num1+" es positivo (+)");
       }
       else if(num1==0){
           JOptionPane.showMessageDialog(null, "El número "+num1+" es igual a 0");
       }
       else{
           JOptionPane.showMessageDialog(null, "El número "+num1+" es negativo (-)");
       }
    }
    
}
