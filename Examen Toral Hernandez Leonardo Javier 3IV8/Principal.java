//Esta clase es el menu para elegir que tipo de juego quieres
//Si es un juego de dos jugadores
//O si es un juego vs la IA
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        //objetos para llamar a las clases del funcionamiento ya sea 
        //Dos jugadores y vs IA
        Dos_Jugadores jugadores = new Dos_Jugadores();
        IA jugador = new IA();
        int opcion, suma=0;
        char letra, dos, ia;
        do{
            System.out.println("3IV8 Toral Hernandez Leonardo Javier");
            System.out.println("En el juego de gato tenemos las siguientes formas de jugar");
            System.out.println("1. Dos jugadores");
            System.out.println("2. VS Maquina");
            System.out.println("Elige una opcion");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    //Opcion de jugar entre dos jugadores
                    do{
                        jugadores.desarrollo();
                        System.out.println("Si deseas volver a jugar gato con dos jugadores escribe una s");
                        dos=entrada.next().charAt(0);
                    } while(dos=='s');
                    break;
                case 2:
                    //Opcion de jugar vs la IA
                    do{
                        jugador.desarrollo1();
                        System.out.println("Si deseas voler a jugar gato contra la IA escribe una s");
                        ia=entrada.next().charAt(0);
                    } while(ia=='s');
                    break;
                default:
                    System.out.println("Usted no escogio ninguna opcion");
            }
            System.out.println("Si desea volver a jugar? Escriba una s");
            letra=entrada.next().charAt(0);
        } while(letra=='s');
    }
}