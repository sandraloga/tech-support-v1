import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
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
    private HashMap<HashSet<String>,String> contesta;

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()

    {
        numero = new Random();
        contesta = new HashMap<>();
        mensajes = new ArrayList<>();
        
        mensajes.add("Are you sure?");
        mensajes.add("I need a bit more information on that.");
        mensajes.add("What is your operating system?");
        mensajes.add("Ok, we are working on that problem.");
        mensajes.add("Can you give me more information?");


        HashSet <String> set01 = new HashSet<>();
        set01.add("free");
        set01.add("app");
        
        HashSet <String> set02 = new HashSet<>();
        set02.add("free");
        
        HashSet <String> set03 = new HashSet<>();
        set03.add("app");
        
        HashSet <String> set04 = new HashSet<>();
        set04.add("problem");
        set04.add("linux");
        set04.add("crash");
        
        contesta.put(set04,"Our software is not designed to run on Linux");
        contesta.put(set01,"In the future we want to offer our software for free");
        contesta.put(set02,"Are you speaking about free as a free beer?");
        contesta.put(set03,"What kind of problem do you have with our app?");
 

       
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> input)
    {
        String respuesta = null;
        
        respuesta = contesta.get(input);

       
        if (respuesta == null)
        {
           respuesta = mensajes.get(numero.nextInt(mensajes.size()));
        }
       
        return respuesta;

    }
}

