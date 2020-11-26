import java.util.Scanner;
public class Principal{
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        Ejercicio4 llamado = new Ejercicio4();
        Ejercicio5 llamado2 = new Ejercicio5();
        Ejercicio6 llamado3 = new Ejercicio6();
        int opcion, suma=0;
        char letra, ej4, ej5, ej6;
        do{
            System.out.println("Toral Hernandez Leonardo Javier 3IV8");
            System.out.println("Bienvenido al menu, tenemos las siguientes opciones");
            System.out.println("1. Pago de trabajadores");
            System.out.println("2. Productos");
            System.out.println("3. Biblioteca");
            System.out.println("Escoge una opcion");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    do{
                        llamado.desarrollo();
                        System.out.println("Si deseas volver a repetir el pago de trabajadores escribe una s");
                        ej4=entrada.next().charAt(0);
                    } while(ej4=='s');
                    break;
                case 2:
                    do{
                        llamado2.desarrollo2();
                        System.out.println("Si deseas volver a repetir los productos escribe una s");
                        ej5=entrada.next().charAt(0);
                    } while(ej5=='s');
                    break;
                case 3:
                    do{
                        llamado3.desarrollo3();
                        System.out.println("Si deseas volver a repetir la biblioteca escribe una s");
                        ej6=entrada.next().charAt(0);
                    } while(ej6=='s');
                    break;
                default:
                    System.out.println("Usted no escogio una opcion");
            }
            System.out.println("Si usted desea volver a repetir el programa escribe una s");
            letra=entrada.next().charAt(0);
        }while(letra=='s');
    }
}