import java.util.Random;
import java.util.ArrayList;
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

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        numero = new Random();
        mensajes = new ArrayList<>();
        mensajes.add ("siga su explicacion, por favor....");
        mensajes.add ("Hable mas despacio....");
        mensajes.add ("Explique son claridad ");
        mensajes.add ("Un momento, por favor...");
        mensajes.add ("Perfecto, siga con la explicacion");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroAleatorio = numero.nextInt(mensajes.size());
        return mensajes.get(numeroAleatorio);
    }
        
}

