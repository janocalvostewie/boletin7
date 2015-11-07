
package boletin7_2;

import javax.swing.JOptionPane;
/**
 *
 * @author jano
 */
public class Boletin7_2 {
    public static void main(String[] args) {
         //ENTRADA DE DATOS
        short num1=Short.parseShort(JOptionPane.showInputDialog("Teclea el primer número:"));
        short num2=Short.parseShort(JOptionPane.showInputDialog("Teclea el primer número:"));
       
       
       //CONDICIÓN
       if (num1>=num2){
           short resta =(short)(num1-num2);
           
           
       }
       //SUMA EN CUALQUIER CASO
           short suma =(short)(num1+num2);
           JOptionPane.showMessageDialog(null, num1+"+"+num2+"="+suma);
       
    }
    
}
