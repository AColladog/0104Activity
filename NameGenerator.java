
/**
 * This class allows us to create names of the movie star wars
 */
public class NameGenerator
{
    

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void generateStarWarsName(String nombre, String apellido1, String apellido2, String ciudad)
    {
        //nombre de la serie
        String nombrePelicula = apellido1.substring(0, 3) + nombre.substring(0, 3).toLowerCase();
        String apellidoPelicula = apellido2.substring(0, 2) + ciudad.substring(0, 2).toLowerCase();
        System.out.println("Nombre real: " + nombre + " " + apellido1 + " " + apellido2 + " " + "\tCiudad de nacimiento: " + ciudad + "\nNombre ficticio: " + nombrePelicula + " " + apellidoPelicula);
    }
}
