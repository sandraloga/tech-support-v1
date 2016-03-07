import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random numero;
    private ArrayList<String> mensajes;
     private HashMap<String,String> contesta;

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    
    {
        contesta = new HashMap<>();
        contesta.put("mas", "digame mas");
        contesta.put("menos","digame menos");
        contesta.put("siga","siga explicandose");
        contesta.put("cansado","Tranquilicese...");
        
        numero = new Random();
        mensajes = new ArrayList<>();
        mensajes.add ("Siga su explicacion, por favor....");
        mensajes.add ("Hable mas despacio....");
        mensajes.add ("Explique son claridad ");
        mensajes.add ("Un momento, por favor...");
        mensajes.add ("Perfecto, siga con la explicacion");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
       String respuesta = null;
        if (contesta.containsKey(input))
        {
            respuesta=contesta.get(input);
        }
        else{   
            
           respuesta = mensajes.get(numero.nextInt(mensajes.size()));
        }
        return respuesta;
        

    }
}

