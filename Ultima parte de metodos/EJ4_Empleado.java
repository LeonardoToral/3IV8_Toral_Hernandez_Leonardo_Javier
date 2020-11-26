public class EJ4_Empleado extends EJ4_Tipos_Empleado{
    private int horas_diurnas, horas_nocturnas;
    private double pago2;
    public EJ4_Empleado(){

    }
    public EJ4_Empleado(String nombre, String puesto, int ID, int sueldo[], double pago2, int horas_diurnas, int horas_nocturnas){
        super(nombre, puesto, ID, sueldo);
        this.pago2=pago2;
        this.horas_diurnas=horas_diurnas;
        this.horas_nocturnas=horas_nocturnas;
    }
    public int gethoras_diurnas(){
        return horas_diurnas;
    }
    public void sethoras_diurnas(int horas_diurnas){
        this.horas_diurnas=horas_diurnas;
    }
    public int gethoras_nocturnas(){
        return horas_nocturnas;
    }
    public void sethoras_nocturnas(int horas_nocturnas){
        this.horas_nocturnas=horas_nocturnas;
    }
    public double getpago2(){
        return pago2;
    }
    public void setpago2(double pago2){
        this.pago2=pago2;
    }
    public void mostrar_empleado(){
        System.out.println("Datos del empleado");
        System.out.println("Nombre: "+getnombre());
        System.out.println("Puesto: "+getpuesto());
        System.out.println("ID: "+getID());
        System.out.println("Sueldo quincenal: "+getsueldo_empleado());
        System.out.println("Horas diurnas: "+gethoras_diurnas());
        System.out.println("Horas nocturnas: "+gethoras_nocturnas());
        System.out.println("Total de pago: "+getpago2());
    }
}