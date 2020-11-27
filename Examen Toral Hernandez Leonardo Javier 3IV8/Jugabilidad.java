//Clase padre de las clases Dos_Players
//En esta esta la variable de matriz de char que corresponde al tablero
public class Jugabilidad{
    private char gato[][] = new char[3][3];
    public Jugabilidad(){
        //Constructor
    }
    public Jugabilidad(char gato[][]){
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                this.gato[i][j]=gato[i][j];
            }
        }
    }
    //getter del tablero
    public char[][] getgato(){
        return gato;
    }
    //setter del tablero
    public void setgato(char gato[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                this.gato[i][j]=gato[i][j];
            }
        }
    }
}