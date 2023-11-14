package problema7ArbolBinario;

/**
 *
 * @author Omar Tc
 */
public class Narbol {
    
    private int dato;
    private Narbol izq;
    private Narbol der;

    public Narbol(int dato) {
        this.dato= dato;
        this.izq=null;
        this.der=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Narbol getIzq() {
        return izq;
    }

    public void setIzq(Narbol izq) {
        this.izq = izq;
    }

    public Narbol getDer() {
        return der;
    }

    public void setDer(Narbol der) {
        this.der = der;
    }
    
    
    
    
    
}
