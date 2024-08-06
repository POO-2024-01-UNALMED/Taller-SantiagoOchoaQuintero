package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{

    //Atributes

    private static ArrayList<String> letras = new ArrayList<String>();

    private String interpretacion;

    //get and set methods
    public ArrayList<String> getLetras(){
        return letras;
    }

    public void setLetras(ArrayList<String> x){
        letras = x;
    }

    public String getInterpretacion(){
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }

    //abstract class methods
    
    public Alfabeto( String interpretacion, ArrayList<String> l){
        super("hola");
        this.interpretacion = interpretacion;
        letras = l;;
    }

    public String toString(){
        String alfabeto = "";
        for (int i = 0; i <= letras.size(); i++) {
            if (i == letras.size()){
                alfabeto += letras.get(i);
            }
            else{
                
                alfabeto += letras.get(i)+", ";
            }
            
        }
        return alfabeto;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    private Integer cantidadLetras(){
        return letras.size();
    }
}
