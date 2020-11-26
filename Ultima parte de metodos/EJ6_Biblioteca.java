public class EJ6_Biblioteca{
    private String titulo[] = new String[50];
    private String autor[] = new String[50];
    private int ejemplares[] = new int[50];
    private int prestados[] = new int [50];
    public EJ6_Biblioteca(){

    }
    public EJ6_Biblioteca(String titulo[], String autor[], int ejemplares[], int prestados[]){
        for(int i=0;i<50;i++){
            this.titulo[i]=titulo[i];
        }
        for(int i=0;i<50;i++){
            this.autor[i]=autor[i];
        }
        for(int i=0;i<50;i++){
            this.ejemplares[i]=ejemplares[i];
        }
        for(int i=0;i<50;i++){
            this.prestados[i]=prestados[i];
        }
    }
    public String[] gettitulo(){
        return titulo;
    }
    public void settitulo(String titulo[]){
        for(int i=0;i<50;i++){
            this.titulo[i]=titulo[i];
        }
    }
    public String[] getautor(){
        return autor;
    }
    public void setautor(String autor[]){
        for(int i=0;i<50;i++){
            this.autor[i]=autor[i];
        }
    }
    public int[] getejemplares(){
        return ejemplares;
    }
    public void setejemplares(int ejemplares[]){
        for(int i=0;i<50;i++){
            this.ejemplares[i]=ejemplares[i];
        }
    }
    public int[] getprestados(){
        return prestados;
    }
    public void setprestados(int prestados[]){
        for(int i=0;i<50;i++){
            this.prestados[i]=prestados[i];
        }
    }
}