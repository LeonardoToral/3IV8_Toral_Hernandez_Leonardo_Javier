public class EJ4_Supervisor extends EJ4_Tipos_Empleado{
    private int seguro, infonavit, ISR;
    private double pago;
    public EJ4_Supervisor(){

    }
    public EJ4_Supervisor(String nombre, String puesto, int ID, int sueldo[], int seguro, int infonavit, int ISR, double pago){
        super(nombre, puesto, ID, sueldo);
        this.seguro=seguro;
        this.infonavit=infonavit;
        this.ISR=ISR;
        this.pago=pago;
    }
    public int getseguro(){
        return seguro;
    }
    public void setseguro(int seguro){
        this.seguro=seguro;
    }
    public int getinfonavit(){
        return infonavit;
    }
    public void setinfonavit(int infonavit){
        this.infonavit=infonavit;
    }
    public int getISR(){
        return ISR;
    }
    public void setISR(int ISR){
        this.ISR=ISR;
    }
    public double getpago(){
        return pago;
    }
    public void setpago(double pago){
        this.pago=pago;
    }
    public void mostrar_supervisor(){
        System.out.println("Datos del supervisor");
        System.out.println("Nombre: "+getnombre());
        System.out.println("Puesto: "+getpuesto());
        System.out.println("ID: "+getID());
        System.out.println("Sueldo quincenal: "+getsueldo_supervisor());
        System.out.println("Seguro de gastos medicos: "+getseguro());
        System.out.println("Infonavit: "+getinfonavit());
        System.out.println("ISR: "+getISR());
        System.out.println("Total del pago: "+getpago());
    }
}