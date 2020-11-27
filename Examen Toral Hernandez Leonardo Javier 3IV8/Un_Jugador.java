//Clase hija de la clase Jugabilidad
//En esta las variables privatizadas es un nombre
//Ya que solo es un jugador el que va a jugar
public class Un_Jugador extends Jugabilidad{
    private String nombre;
    public Un_Jugador(){
        //Constructor
    }
    public Un_Jugador (char gato[][], String nombre){
        super(gato);
        this.nombre=nombre;
    }
    //getter del nombre
    public String getnombre(){
        return nombre;
    }
    //setter del nombre
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
}