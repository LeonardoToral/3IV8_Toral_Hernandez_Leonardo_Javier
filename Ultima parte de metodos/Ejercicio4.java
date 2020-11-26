import java.util.Scanner;
public class Ejercicio4{
    public void desarrollo(){
        EJ4_Supervisor supervisor = new EJ4_Supervisor();
        EJ4_Empleado empleado = new EJ4_Empleado();
        EJ4_Tipos_Empleado tipos = new EJ4_Tipos_Empleado();
        Scanner entrada = new Scanner(System.in);
        String nombre, puesto;
        int ID, parametro1, parametro2, parametro3, sueldo;
        double pago;
        System.out.println("Ingrese su nombre");
        nombre=entrada.nextLine();
        empleado.setnombre(nombre);
        supervisor.setnombre(nombre);
        System.out.println("Ingrese su puesto");
        puesto=entrada.nextLine();
        empleado.setpuesto(puesto);
        supervisor.setpuesto(puesto);
        System.out.println("Ingrese su ID");
        ID=entrada.nextInt();
        empleado.setID(ID);
        supervisor.setID(ID);
        if(puesto.equals("Empleado")){
            System.out.println("Ingrese las horas diurnas (maximo solo se contaran 5)");
            parametro1=entrada.nextInt();
            if(parametro1>5){
                parametro1=5;
            }
            empleado.sethoras_diurnas(parametro1);
            System.out.println("Ingrese las horas nocturnas (maximo solo se contaran 5)");
            parametro2=entrada.nextInt();
            if(parametro2>5){
                parametro2=5;
            }
            empleado.sethoras_nocturnas(parametro2);
            sueldo=tipos.getsueldo_empleado();
            pago=sueldo+(parametro1*50)+(parametro2*60);
            empleado.setpago2(pago);
            empleado.mostrar_empleado();
        }else{
            System.out.println("Ingrese el seguro de gastos medicos");
            parametro1=entrada.nextInt();
            supervisor.setseguro(parametro1);
            System.out.println("Ingrese el ISR");
            parametro2=entrada.nextInt();
            supervisor.setISR(parametro2);
            System.out.println("Ingrese el infonavit");
            parametro3=entrada.nextInt();
            supervisor.setinfonavit(parametro3);
            sueldo=tipos.getsueldo_supervisor();
            pago=sueldo-(parametro3*0.2)-(parametro2*0.16)-(parametro1*0.1);
            supervisor.setpago(pago);
            supervisor.mostrar_supervisor();
        }
    }
}