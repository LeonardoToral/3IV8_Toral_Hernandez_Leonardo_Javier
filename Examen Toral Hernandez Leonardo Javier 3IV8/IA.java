//Clase para el funcionamiento del juego vs la IA
import java.util.*;
public class IA{
    Scanner entrada = new Scanner (System.in);
    Un_Jugador ia = new Un_Jugador();
    public void desarrollo1(){
        char matriz[][] = new char[3][3];
        int ganador=0;
        String nombre;
        int turno,a=2, b=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]='s';
            }
        }
        System.out.println("Ingresa el nombre del jugador");
        nombre=entrada.nextLine();
        ia.setnombre(nombre);
        ia.setgato(matriz);
        //Numero random que nos permite determinar quien va a iniciar primero
        turno=(int) (Math.random()*(a-b+1)+b);
        if(turno==2){
            System.out.println("Inicia primero "+nombre);
        }
        else{
            System.out.println("Inicia primero la IA");
        }
        for(int i=0;i<9;i++){
            //El if ganador==0 nos permite saber que podemos seguir la partida
            //Porque nos permite saber si todavia no hay ganador
            if(ganador==0){
                //Saber a quien le toca si a la IA o al jugador
                if(turno==2&&i%2==1){
                    System.out.println("Turno de la IA");
                    tiradaIA();
                }
                else{
                    if(turno==2&&i%2==0){
                        tiradajugador();
                    }
                }
                if(turno==1&&i%2==1){
                    tiradajugador();
                }
                else{
                    if(turno==1&&i%2==0){
                        System.out.println("Turno de la IA");
                        tiradaIA();
                    }
                }
                matriz=ia.getgato();
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
                //LLamada del metodo verificar despues de 5 tiradas
                if(i>=4){
                    ganador=verificar();
                }
            }
        }
        //Verificacion del ganador o del empate
        if(ganador==0){
            System.out.println("Hubo un empate");
        }
        else{
            if(ganador==1){
                System.out.println("El ganador es "+nombre);
            }
            else{
                System.out.println("El ganador es la IA");
            }
        }
    }
    //Metodo para hacer la funcion de la tirada del jugador
    public void tiradajugador(){
        char auxiliar3[][] = new char[3][3];
        int fila, columna, saber=0;
        String name;
        name = ia.getnombre();
        auxiliar3 = ia.getgato();
        do{
            System.out.println("Turno de "+name);
            //Tiros del jugador
            System.out.println("Ingresa la fila de tu tiro (las filas son de 0 a 2)");
            fila=entrada.nextInt();
            System.out.println("Ingresa la columna de tu tiro (las columnas son de 0 a 2)");
            columna=entrada.nextInt();
            entrada.nextLine();
            if((fila>=0&&fila<=2)&&(columna>=0&&columna<=2)){
                //Verificacion si la casilla no esta ocupada
                if(auxiliar3[fila][columna]=='s'){
                    auxiliar3[fila][columna]='X';
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
        ia.setgato(auxiliar3);
    }
    //Metodo para hacer la funcion del tiro de la IA
    public void tiradaIA(){
        char auxiliar4[][] = new char[3][3];
        int saber2=0;
        auxiliar4 = ia.getgato();
        do{
            //Numero random del la tirada de la IA
            int fila1 = (int) (Math.random()*3+1);
            int columna1 = (int) (Math.random()*3+1);
            //Verificacion si la posicion ha sido ocupada
            if(auxiliar4[fila1-1][columna1-1]=='s'){
                auxiliar4[fila1-1][columna1-1]='O';
                saber2=1;
            }
        }while(saber2==0);
        ia.setgato(auxiliar4);
    }
    //Metodo para verificar si hay una jugada ganadora
    public int verificar(){
        char auxiliar[][] = new char[3][3];
        int auxiliar2;
        auxiliar=ia.getgato();
        auxiliar2=0;
        for(int i=0;i<3;i++){
            //Verificacion de si gano el jugador
            if((auxiliar[i][0]=='X' && auxiliar[i][1]=='X'&&auxiliar[i][2]=='X')||(auxiliar[0][i]=='X'&&auxiliar[1][i]=='X'&&auxiliar[2][i]=='X')){
                auxiliar2=1;
            }
            //Verificacion de si gano la IA
            if((auxiliar[i][0]=='O' && auxiliar[i][1]=='O' && auxiliar[i][2]=='O')||(auxiliar[0][i]=='O' && auxiliar[1][i]=='O'&&auxiliar[2][i]=='O')){
                auxiliar2=2;
            }
        }
        if(auxiliar2==0){
            //Verificacion de si gano el jugador
            if((auxiliar[0][0]=='X'&&auxiliar[1][1]=='X'&&auxiliar[2][2]=='X')||(auxiliar[0][2]=='X'&&auxiliar[1][1]=='X'&&auxiliar[2][0]=='X')){
                auxiliar2=1;
            }
            //Verificacion de si gano la IA
            if((auxiliar[0][0]=='O'&&auxiliar[1][1]=='O'&&auxiliar[2][2]=='O')||(auxiliar[0][2]=='O'&&auxiliar[1][1]=='O'&&auxiliar[2][0]=='O')){
                auxiliar2=2;
            }
        }
        return auxiliar2;
        //Retorna un 0 si todavia no hay ganador
        //Retorna un 1 si gano el jugador
        //Retorna un 2 si gano la IA
    }
}