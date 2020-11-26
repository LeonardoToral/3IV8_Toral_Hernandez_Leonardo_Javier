import java.util.Scanner;
public class Ejercicio5{
    Scanner entrada = new Scanner(System.in);
    EJ5_Proveedores proveedores = new EJ5_Proveedores();
    String nombre;
    String nombre_productos[]=new String[10];
    int costo[]=new int[10];
    int existencia[]=new int[10];
    public void desarrollo2(){
        System.out.println("Ingresa el nombre del cliente");
        nombre=entrada.nextLine();
        proveedores.setcliente(nombre);
        for(int i=0;i<10;i++){
            System.out.println("Ingresa el nombre del producto: "+(i+1));
            nombre_productos[i]=entrada.nextLine();
        }
        proveedores.setproducto(nombre_productos);
        for(int i=0;i<10;i++){
            System.out.println("Ingresa el costo del producto "+(i+1));
            costo[i]=entrada.nextInt();
        }
        proveedores.setcosto(costo);
        for(int i=0;i<10;i++){
            System.out.println("Ingresa la cantidad del producto "+(i+1));
            existencia[i]=entrada.nextInt();
        }
        proveedores.setexistencia(existencia);
        total_mayor_menor_promedio_costo();
        costo_total1();
    }
    public void total_mayor_menor_promedio_costo(){
        int auxiliar[]=new int[10];
        int mayor_costo=0, menor_costo=2000000000;
        double costo_promedio=0, suma_total=0;
        auxiliar=proveedores.getcosto();
        for(int i=0;i<10;i++){
            if(auxiliar[i]>mayor_costo){
                mayor_costo=auxiliar[i];
            }
            if(auxiliar[i]<menor_costo){
                menor_costo=auxiliar[i];
            }
            suma_total+=auxiliar[i];
        }
        costo_promedio=suma_total;
        costo_promedio/=10;
        System.out.println("El costo de todos los productos es: "+suma_total);
        System.out.println("El costo mayor es: "+mayor_costo);
        System.out.println("El costo menor es: "+menor_costo);
        System.out.println("El costo promedio es: "+ costo_promedio);
    }
    public void costo_total1(){
        String auxiliar4[] = new String[10];
        int auxiliar2[] = new int[10];
        int auxiliar3[] = new int[10];
        int costo_total[] = new int[10];
        String nombre;
        nombre=proveedores.getcliente();
        auxiliar2=proveedores.getcosto();
        auxiliar3=proveedores.getexistencia();
        auxiliar4=proveedores.getproducto();
        for(int i=0;i<10;i++){
            costo_total[i]=auxiliar2[i]*auxiliar3[i];
        }
        System.out.println("Nombre del cliente: "+nombre);
        for(int i=0;i<10;i++){
            System.out.println("Nombre del producto "+(i+1)+": "+auxiliar4[i]);
            System.out.println("Costo del producto 1 de manera individual "+(i+1)+": "+auxiliar2[i]);
            System.out.println("Total de unidades del producto "+(i+1)+": "+auxiliar3[i]);
            System.out.println("Costo total de todas las unidades del producto "+(i+1)+": "+costo_total[i]);
        }
    }
}