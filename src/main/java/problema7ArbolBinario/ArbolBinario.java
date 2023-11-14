package problema7ArbolBinario;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Omar Tc
 */
public class ArbolBinario {

    private Narbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public Narbol getRaiz() {
        return raiz;
    }

    public void setRaiz(Narbol raiz) {
        this.raiz = raiz;
    }
    
    

    public void insertarNodoalArbol(int dato) {
        Narbol nuevo = new Narbol(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Narbol tem = raiz;
            Narbol padre;
            while (true) {
                padre = tem;
                if (dato < tem.getDato()) {
                    tem = tem.getIzq();
                    if (tem == null) {
                        padre.setIzq(nuevo);
                        return;
                    }
                } else {
                    tem = tem.getDer();
                    if (tem == null) {
                        padre.setDer(nuevo);
                        return;
                    }
                }
            }
        }
    }

    public boolean eliminar (int dato){
        Narbol auxiliar = raiz;
        Narbol padre= raiz;
        boolean esHijoIzq=true;
        
        while (auxiliar.getDato()!=dato) {            
            padre=auxiliar;
            if (dato<auxiliar.getDato()) {
                esHijoIzq=true;
                auxiliar=auxiliar.getIzq();
            }else{
                esHijoIzq=false;
                auxiliar=auxiliar.getDer();
            }if (auxiliar==null) {
                return false;
            }
        }//Fin del while
        if (auxiliar.getIzq()== null && auxiliar.getDer()==null) {
            if (auxiliar==raiz) {
                raiz=null;
            }else if (esHijoIzq) {
                padre.setIzq(null);
            }else{
                padre.setDer(null);
            }
        }else if (auxiliar.getDer()==null) {
            if (auxiliar==raiz) {
                raiz=auxiliar.getIzq();
            }else if (esHijoIzq) {
                padre.setIzq(auxiliar.getIzq());
            }else{
                padre.setDer(auxiliar.getIzq());
            }
        }else if (auxiliar.getIzq()==null) {
            if (auxiliar==raiz) {
                raiz=auxiliar.getDer();
            }else if (esHijoIzq) {
                padre.setIzq(auxiliar.getDer());
            }else{
                padre.setDer(auxiliar.getIzq());
            }
        }else{
            Narbol reemplazo = obtenerReemplazo(auxiliar);
            if (auxiliar==raiz) {
                raiz=reemplazo;
            }else if (esHijoIzq) {
                padre.setIzq(reemplazo);
            }else{
                padre.setDer(reemplazo);
            }
            reemplazo.setIzq(auxiliar.getIzq());
        }
        return true;
    }
    
    //Metodo encargado de devolvernos el nodo Reemplazo;
    public Narbol obtenerReemplazo(Narbol nodoReemp){
        Narbol reemplazarPadre= nodoReemp;
        Narbol reemplazo= nodoReemp;
        Narbol auxiliar= nodoReemp.getDer();
        while (auxiliar!=null) {            
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.getIzq();
        }
        if (reemplazo!= nodoReemp.getDer()) {
            reemplazarPadre.setIzq(reemplazo.getDer());
            reemplazo.setDer(nodoReemp.getDer());
        }
        JOptionPane.showMessageDialog(null, "El nodo reemplazp es "+reemplazo.toString());
        return reemplazo;
    }
    
    
    public Narbol buscarelemento(int dato){
        Narbol temp= raiz;
        while (temp.getDato()!= dato) {            
            if (dato<temp.getDato()) {
                temp=temp.getIzq();
            }else{
                temp=temp.getDer();
            }
            if (temp==null) {
                JOptionPane.showMessageDialog(null, "Dato no encontrado!!");
                return null;
            }
        }return temp;
    }
    
}
