import java.util.Scanner;
public class Ejercicio6{
    Scanner entrada = new Scanner (System.in);
    EJ6_Biblioteca biblioteca = new EJ6_Biblioteca();
    int num_libros;
    public void desarrollo3(){
        String titulo[] = new String[50];
        String autor[] = new String[50];
        int existencia[] = new int[50];
        int prestamos[] = new int[50];
        int opcion;
        char letra, letra2;
        System.out.println("Ingresa el numeros de libros con los que cuenta la biblioteca (maximo se pueden 50 libros)");
        num_libros = entrada.nextInt();
        entrada.nextLine();
        if(num_libros>50){
            num_libros = 50;
        }
        for (int i=0;i<num_libros;i++){
            System.out.println("Ingresa el titulo del libro");
            titulo[i] = entrada.nextLine();
            System.out.println("Ingresa el autor del libro "+titulo[i]);
            autor[i] = entrada.nextLine();
            System.out.println("Ingresa el numero de ejemplares");
            existencia[i] = entrada.nextInt();
            entrada.nextLine();
            prestamos[i]=0;
        }
        biblioteca.settitulo(titulo);
        biblioteca.setautor(autor);
        biblioteca.setejemplares(existencia);  
        biblioteca.setprestados(prestamos);
        do{
            System.out.println("Tenemos las siguientes opciones");
            System.out.println("1. Devolver un libro");
            System.out.println("2. Prestamo de un libro");
            System.out.println("3. Consulta de libros");
            System.out.println("Elige una opcion");
            opcion=entrada.nextInt();
            entrada.nextLine();
            switch(opcion){
                case 1:
                    do{
                        devolver();
                        System.out.println("Escriba una s si quiere devolver otro libro");
                        letra2=entrada.next().charAt(0);
                    }while(letra2=='s');
                    break;
                case 2:
                    do{
                        prestar();
                        System.out.println("Escriba una s si quiere hacer otro prestamo");
                        letra2=entrada.next().charAt(0);
                    }while(letra2=='s');
                    break;
                case 3:
                    do{
                        mostrarlibros();
                        System.out.println("Escriba una s si quiere volver a ver los datos de los libros");
                        letra2=entrada.next().charAt(0);
                    }while(letra2=='s');
                    break;
                default:
                    System.out.println("Usted no escogio una opcion");
            }
            System.out.println("Escriba una s si quiere volver a realizar otro tramite con la biblioteca");
            letra=entrada.next().charAt(0);
        }while(letra=='s');
    }
    public void devolver(){
        int existencia[] = new int[50];
        int prestamo[] = new int[50];
        String nombre[] = new String[50];
        String devolucion;
        int auxiliar2=0;
        existencia = biblioteca.getejemplares();
        prestamo = biblioteca.getprestados(); 
        nombre = biblioteca.gettitulo();
        entrada.nextLine();
        System.out.println("Ingresa el titulo del libro que quieres devolver");
        devolucion = entrada.nextLine();
        for(int i=0;i<num_libros;i++){
            if(devolucion.equals(nombre[i])){
                auxiliar2++;
                if(prestamo[i]==0){
                    System.out.println("Usted no puede devolver este libro porque no ha sido prestado ese libro");
                }
                else{
                    System.out.println("Muchas gracias por devolver el libro");
                    prestamo[i]--;
                    existencia[i]++;
                }
                break;
            }
        }
        if(auxiliar2==0){
            System.out.println("El libro que usted solicita no lo tenemos en la biblioteca");
        }
        else{
            biblioteca.setprestados(prestamo);
            biblioteca.setejemplares(existencia);
        }
    }
    public void prestar(){
        int existencia2[] = new int[50];
        int prestamo2[] = new int[50];
        String nombre2[] = new String[50];
        String prestar;
        int auxiliar=0;
        existencia2=biblioteca.getejemplares();
        prestamo2=biblioteca.getprestados();
        nombre2=biblioteca.gettitulo();
        entrada.nextLine();
        System.out.println("Ingrese el titulo que deseas tomar prestado");
        prestar=entrada.nextLine();
        for(int i=0;i<num_libros;i++){
            if(prestar.equals(nombre2[i])){
                auxiliar++;
                if(existencia2[i]<=0){
                    System.out.println("Lamentablemente no podemos prestarle el libro ya que todos han sido prestados");
                    existencia2[i]=0;
                }
                else{
                    System.out.println("Aqui esta el libro, cuidelo bien");
                    existencia2[i]--;
                    prestamo2[i]++;
                }
                break;
            }
        }
        if(auxiliar==0){
            System.out.println("El libro que usted solicita no lo tenemos en la biblioteca");
        }
        else{
            biblioteca.setprestados(prestamo2);
            biblioteca.setejemplares(existencia2);
        }
    }
    public void mostrarlibros(){
        int existencia3[] = new int[50];
        int prestamo3[] = new int[50];
        String nombre3[] = new String[50];
        String autor2[] = new String[50];
        existencia3 = biblioteca.getejemplares();
        prestamo3 = biblioteca.getprestados();
        nombre3 = biblioteca.gettitulo();
        autor2 = biblioteca.getautor();
        for(int i=0;i<num_libros;i++){
            System.out.println("Titulo del libro: "+ nombre3[i]);
            System.out.println("Autor del libro: "+ autor2[i]);
            System.out.println("Ejemplares que no han sido prestados:" + existencia3[i]);
            if(prestamo3[i]<0){
                System.out.println("Ejemplares que ha sido prestados: 0");
            }
            else{
                System.out.println("Ejemplares que han sido prestados: " + prestamo3[i]);
            }
        }
    }
}