package comunicacion;
import java.util.ArrayList;

public class Fabula extends Escrito{
    //Atributtes
    private String ensenanza;
    private String interpretacion;
    //Gets and sets
    public String getInterpretacion(){
        return this.interpretacion;
    }
    public String getEnsenanza(){
        return this.ensenanza;
    }
    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    public void setEnsenanza(String ensenanza){
        this.ensenanza = ensenanza;
    }
    //Abstract methods
    public int palabrasTotales(int hola){
        return 1;
    }
    public String toString(){
        return "hola";
    }
    public String interpretacion(){
        return this.interpretacion;
    }
}
