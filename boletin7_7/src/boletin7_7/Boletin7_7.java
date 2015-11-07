package boletin7_7;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Boletin7_7 {
    public static void main(String[] args) {
        
        //CREACIÓN DEL MENÚ
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("ELIJE UNA OPCIÓN\n---------------------------------\n1.Círculo\n2. Cuadrado\n3. Rectángulo\n4. Triángulo"));
        
        //VARIACIÓN DE LAS OPCIONES
        switch (opcion){
            case 1:
                float radio = Float.parseFloat(JOptionPane.showInputDialog("Has elegido el círculo\n Inserta el radio:"));
                float area=(float)(3.14*Math.pow(radio, 2));
                JOptionPane.showMessageDialog(null,"El área de tu círculo es: "+area);
                break;
            case 2:
                float lado = Float.parseFloat(JOptionPane.showInputDialog("Has elegido el cuadrado\n Inserta el lado:"));
                float areac=(float)(Math.pow(lado, 2));
                JOptionPane.showMessageDialog(null,"El área de tu cuadrado es: "+areac);
                break;
            case 3:
                float alto = Float.parseFloat(JOptionPane.showInputDialog("Has elegido el rectángulo\n Inserta el alto:"));
                float ancho = Float.parseFloat(JOptionPane.showInputDialog("Inserta el ancho:"));
                float arear=(float)(alto*ancho);
                JOptionPane.showMessageDialog(null,"El área de tu rectángulo es: "+arear);
                break;
            case 4:
                float altot = Float.parseFloat(JOptionPane.showInputDialog("Has elegido el triángulo\n Inserta la altura:"));
                float base = Float.parseFloat(JOptionPane.showInputDialog("Inserta la base:"));
                float areat=(float)((altot*base)/2);
                JOptionPane.showMessageDialog(null,"El área de tu triángulo es: "+areat);
                break;
            default :
                JOptionPane.showMessageDialog(null,"No es una opción válida");
            }
        }
    }