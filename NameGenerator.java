
/**
 * This class allows us to create names of the movie star wars
 */
public class NameGenerator
{
    private static final int INICIO = 0;
    private static final int NOMBRE = 3;
    private static final int APELLIDO = 2;

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
        String nombrePelicula = apellido1.substring(INICIO, NOMBRE) + nombre.substring(INICIO, NOMBRE).toLowerCase();
        String apellidoPelicula = apellido2.substring(INICIO, APELLIDO) + ciudad.substring(INICIO, APELLIDO).toLowerCase();
        System.out.println("Nombre real: " + nombre + " " + apellido1 + " " + apellido2 + " " + "\tCiudad de nacimiento: " + ciudad + "\nNombre ficticio: " + nombrePelicula + " " + apellidoPelicula);
    }
}
