//En esta clase tenemos el funcionamiento del juego entre dos jugadores
import java.util.*;
public class Dos_Jugadores{
    Scanner entrada = new Scanner (System.in);
    Dos_Players dosjugadores = new Dos_Players();
    public void desarrollo(){
        char matriz[][] = new char[3][3];
        int ganador=0;
        String nombre1, nombre2;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]='s';
            }
        }
        //Lectura de los nombres de los dos jugadores
        System.out.println("Ingresa el nombre del jugador 1");
        nombre1=entrada.nextLine();
        dosjugadores.setnombre1(nombre1);
        System.out.println("Ingresa el nombre del jugador 2");
        nombre2=entrada.nextLine();
        dosjugadores.setnombre2(nombre2);
        dosjugadores.setgato(matriz);
        for(int i=0;i<9;i++){
            //El if ganador==0 nos permite saber si todavia se puede desarrollar el juego
            //Porque nos permite saber si todavia no hay un ganador
            if(ganador==0){
                tirada(i);
                matriz=dosjugadores.getgato();
                //Impresion del tablero del gato despues de cada movimiento
                for(int j=0;j<3;j++){
                    System.out.println(" ");
                    if(matriz[j][0]=='s'){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(matriz[j][0]);
                    }
                    System.out.print(" | ");
                    if(matriz[j][1]=='s'){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(matriz[j][1]);
                    }
                    System.out.print(" | ");
                    if(matriz[j][2]=='s'){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(matriz[j][2]);
                    }
                    System.out.println(" ");
                    if(j<2){
                        System.out.println("-----------");
                    }
                }
                System.out.println(" ");
                if(i>=4){
                    //nos permite llamar al metodo verificar si ya hay un ganador
                    //esto solo se activa despues del quinto tiro ya que antes no es posible tener un ganador
                    ganador=verificar();
                }
            }
        }
        //Nos permite decir si un jugador gano o hubo un empate
        if(ganador==0){
            System.out.println("Hubo un empate");
        }
        else{
            if(ganador==1){
                System.out.println("El ganador es "+nombre1);
            }
            else{
                System.out.println("El ganador es "+nombre2);
            }
        }
    }
    //Metodo para hacer la funcion de tirar de ambos jugadores
    public void tirada(int jugada){
        char auxiliar3[][] = new char[3][3];
        int fila, columna, saber=0;
        String name1, name2;
        name1 = dosjugadores.getnombre1();
        name2 = dosjugadores.getnombre2();
        auxiliar3 = dosjugadores.getgato();
        do{
            //Si el turno de la tirada es par entondes le toca al jugador 1 tirar
            //Si el turno es impar le toca al jugador 2
            if(jugada%2==0){
                System.out.println("Turno de "+name1);
            }
            else{
                System.out.println("Turno de "+name2);
            }
            System.out.println("Ingresa la fila de tu tiro (las filas son de 0 a 2)");
            fila = entrada.nextInt();
            System.out.println("Ingresa la columna de tu tiro (las columnas son de 0 a 2)");
            columna=entrada.nextInt();
            entrada.nextLine();
            if((fila>=0&&fila<=2)&&(columna>=0&&columna<=2)){
                //Verificar si la posicion del tablero es valida
                if(auxiliar3[fila][columna]=='s'){
                    //si es par es una X del jugador 1
                    //Si es impar es una O del jugador 2
                    if(jugada%2==0){
                        auxiliar3[fila][columna]='X';
                    }
                    else{
                        auxiliar3[fila][columna]='O';
                    }
                    saber=1;
                }
                else{
                    System.out.println("La casilla que eligio ya esta ocupada");
                }
            }
            else{
                System.out.println("No existe esa casilla");
            }
        }while(saber==0);
        dosjugadores.setgato(auxiliar3);
    }
    //Metodo de verificar si hay un ganador
    public int verificar(){
        char auxiliar[][] = new char[3][3];
        int auxiliar2;
        auxiliar=dosjugadores.getgato();
        auxiliar2=0;
        for(int i=0;i<3;i++){
            if((auxiliar[i][0]=='X' && auxiliar[i][1]=='X'&&auxiliar[i][2]=='X')||(auxiliar[0][i]=='X'&&auxiliar[1][i]=='X'&&auxiliar[2][i]=='X')){
                auxiliar2=1;
            }
            if((auxiliar[i][0]=='O' && auxiliar[i][1]=='O' && auxiliar[i][2]=='O')||(auxiliar[0][i]=='O' && auxiliar[1][i]=='O'&&auxiliar[2][i]=='O')){
                auxiliar2=2;
            }
        }
        if(auxiliar2==0){
            if((auxiliar[0][0]=='X'&&auxiliar[1][1]=='X'&&auxiliar[2][2]=='X')||(auxiliar[0][2]=='X'&&auxiliar[1][1]=='X'&&auxiliar[2][0]=='X')){
                auxiliar2=1;
            }
            if((auxiliar[0][0]=='O'&&auxiliar[1][1]=='O'&&auxiliar[2][2]=='O')||(auxiliar[0][2]=='O'&&auxiliar[1][1]=='O'&&auxiliar[2][0]=='O')){
                auxiliar2=2;
            }
        }
        //Retorna un 0 si todavia no hay un ganador 
        //Retorna un 1 si el jugador 1 ha ganado
        //Retorna un 2 si el jugador 2 ha ganado
        return auxiliar2;
    }
}