public class EJ5_Proveedores{
    private String cliente;
    private String producto[]=new String[10];
    private int costo[] = new int[10];
    private int existencia[] = new int[10];
    private int costo_mayor, costo_menor, suma_total;
    private double costo_promedio;
    private int costo_total[] = new int[10];
    public EJ5_Proveedores(){

    }
    public EJ5_Proveedores(String cliente, String producto[], int costo[], int existencia[]){
        this.cliente=cliente;
        for(int i=0;i<10;i++){
            this.producto[i]=producto[i];
        }
        for(int i=0;i<10;i++){
            this.costo[i]=costo[i];
        }
        for(int i=0;i<10;i++){
            this.existencia[i]=existencia[i];
        }
    }
    public String getcliente(){
        return cliente;
    }
    public void setcliente(String cliente){
        this.cliente=cliente;
    }
    public String[] getproducto(){
        return producto;
    }
    public void setproducto(String producto[]){
        for(int i=0;i<10;i++){
            this.producto[i]=producto[i];
        }
    }
    public int[] getcosto(){
        return costo;
    }
    public void setcosto(int costo[]){
        for(int i=0;i<10;i++){
            this.costo[i]=costo[i];
        }
    }
    public int[] getexistencia(){
        return existencia;
    }
    public void setexistencia(int existencia[]){
        for(int i=0;i<10;i++){
            this.existencia[i]=existencia[i];
        }
    }
}