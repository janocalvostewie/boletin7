package boletin7_6;
/**
 *
 * @author Jano
 */
public class Producto {
    //ATRIBUTOS
    private String nombre;
    private float numVentas;
    
    //CONSTRUCTORES
    public Producto(){};
    public Producto(String nombre, float numVentas){
        this.nombre=nombre;
        this.numVentas=numVentas;
    }
    
    //SETTERS
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setNumVentas(float numVentas){this.numVentas=numVentas;}
    
    //GETTERS
    public String getNombre(){return nombre;}
    public float getNumVentas(){return numVentas;}
    
    //MÉTODOS
    public String getTipo(){
        String tipo=null;
        if (numVentas<=100){tipo="Consumo bajo";}
        else if((100<numVentas)&&(numVentas<=500)){tipo= "Consumo medio";}
        else if((500<numVentas)&&(numVentas<=1000)){tipo= "Consumo alto";}
        else if(numVentas>1000){tipo= "Primera necesidad";}
        else{tipo ="ha fallado";}
        return tipo;
    }
    
}
