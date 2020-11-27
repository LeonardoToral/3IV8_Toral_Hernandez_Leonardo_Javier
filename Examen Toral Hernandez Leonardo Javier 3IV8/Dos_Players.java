//Clase hija del la clase Jugabilidad
//En esta clase hay dos variables privatizadas 
//Estas se refieren a los nombres de los dos jugadores
public class Dos_Players extends Jugabilidad{
    private String nombre1, nombre2;
    public Dos_Players(){
        //Constructor
    }
    public Dos_Players(char gato[][], String nombre1, String nombre2){
        super(gato);
        this.nombre1=nombre1;
        this.nombre2=nombre2;
    }
    //getter del nombre del jugador 1
    public String getnombre1(){
        return nombre1;
    }
    //setter del nombre del jugador 1
    public void setnombre1(String nombre1){
        this.nombre1=nombre1;
    }
    //getter del nombre del jugador 2
    public String getnombre2(){
        return nombre2;
    }
    //setter del nombre del jugador 2
    public void setnombre2(String nombre2){
        this.nombre2=nombre2;
    }
}