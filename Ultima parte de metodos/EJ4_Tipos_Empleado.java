public class EJ4_Tipos_Empleado{
    private String nombre, puesto;
    private int ID;
    private int sueldo[] = new int[]{5000, 8000};
    public EJ4_Tipos_Empleado(){
        //Constructor
    }
    public EJ4_Tipos_Empleado(String nombre, String puesto, int ID, int sueldo[]){
        this.nombre=nombre;
        this.puesto=puesto;
        this.ID=ID;
        this.sueldo[0]=5000;
        this.sueldo[1]=8000;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getpuesto(){
        return puesto;
    }
    public void setpuesto(String puesto){
        this.puesto=puesto;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public int getsueldo_empleado(){
        return sueldo[0];
    }
    public int getsueldo_supervisor(){
        return sueldo[1];
    }
}