package comunicacion;
import java.util.ArrayList;

public class Libro extends Escrito{

    //Atributtes

    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    //abstract methods
    
    public int palabrasTotales(int hola){
        return 1;
    }

    public String toString(){
        return "hola";
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    //Get and sets

    public String getCo_autor (){
        return this.co_autor;
    }
    public String getEditorial (){
        return this.editorial;
    }
    public String getEdicion (){
        return this.edicion;
    }
    public String getInterpretacion (){
        return this.interpretacion;
    }

    public void setCo_autor(String co_autor ){
        this.co_autor = co_autor;
    }
    public void setEditorial (String editorial ){
        this.editorial = editorial;
    }
    public void setEdicion (String edicion){
        this.edicion = edicion;
    }
    public void setInterpretacion (String interpretacion){
        this.interpretacion = interpretacion;
    }
    
}
