
package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author jano
 */
public class Persona {
    private String nombre;
    private float peso;
    
    //CONSTRUCTORES
    public Persona(){}
    public Persona (String nombre, float peso){
        this.nombre=nombre;
        this.peso=peso;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    //GETTERS
    public String getNombre(){return nombre;}
    public float getPeso(){return peso;}
    
    //MÉTODOS
    public void llamarFicha(){
        JOptionPane.showMessageDialog(null, "FICHA PERSONAL\n----------------\nNombre: "+nombre+"\nPeso: "+peso);
    }
}
