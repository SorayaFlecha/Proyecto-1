//creamos la clase Person

public class Person
{
    // poenemos el atributo edad
    private int edad;
    
    /**
     * creamos el constructor
     */
    public Person(int edadQueTiene)
    {
        // Ponemos los años que tengamos entre parentesis
         edad = edadQueTiene;
    }

    /**
     *Creamos el metodo para invocar la edad que tiene cada personacrada. 
     */
    public int getEdad()
    {
        // Este metodo nos devolvera la edad que tien la persona que hemos creado.
        return edad;
    }
}

