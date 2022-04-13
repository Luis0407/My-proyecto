
public class Caja {
    int alto;
    int  profundo;
    int ancho;
    
    public Caja(){
        System.out.println("Constructor vacio");
    
    }
    public  Caja(int alto,int ancho,int profundo){
    
    this.ancho=ancho;
    this.alto=alto;
    this.profundo=profundo;
    
 
    }
    public int VolumenCaja(){
    
    return this.ancho*this.alto*this.profundo;
    }
}
