package boletin7_5;

import javax.swing.JOptionPane;
/**
 *
 * @author jano
 */
public class Boletin7_5 {
    public static void main(String[] args) {
        //ENTRADA DE DATOS CON CREACIÓN DE OBJETOS
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Teclea el primer número:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Teclea el segundo número:"));
        int num3=Integer.parseInt(JOptionPane.showInputDialog("Teclea el tercer número:"));
        //CONDICIONES
        if(num1>num2 && num1>num3){
            JOptionPane.showMessageDialog(null,"El número: "+num1+" es el mayor de los tres");
        }
        else if(num2>num1 && num2>num3){
           JOptionPane.showMessageDialog(null,"El número: "+num2+" es el mayor de los tres");
        }
        else{
            JOptionPane.showMessageDialog(null,"El número: "+num3+" es el mayor de los tres");
        }
    }
    
}
