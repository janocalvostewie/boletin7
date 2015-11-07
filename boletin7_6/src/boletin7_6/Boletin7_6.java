package boletin7_6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin7_6 {
    public static void main(String[] args) {
        
        //CREAMOS LOS OBJETOS
        Producto primerProducto = new Producto(JOptionPane.showInputDialog("Nombre del artículo:"), Float.parseFloat(JOptionPane.showInputDialog("Teclea las ventas:")));
        Producto segundoProducto = new Producto(JOptionPane.showInputDialog("Nombre del artículo:"), Float.parseFloat(JOptionPane.showInputDialog("Teclea las ventas:")));
        Producto tercerProducto = new Producto(JOptionPane.showInputDialog("Nombre del artículo:"), Float.parseFloat(JOptionPane.showInputDialog("Teclea las ventas:")));

        //CREAMOS EL ARRAY
          ArrayList <String> articulos = new ArrayList <> (); 
          articulos.add(primerProducto.getNombre()+"     "+primerProducto.getTipo());
          articulos.add(segundoProducto.getNombre()+"     "+segundoProducto.getTipo());
          articulos.add(tercerProducto.getNombre()+"     "+tercerProducto.getTipo());
          
          //BUCLE QUE IMPRIME
          for (String articulo : articulos){
              JOptionPane.showMessageDialog(null, articulo);
          }
          

                    
              
                    
    } 
    }