/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class NodoArbol {
     private String dato;
     private String genero;
    private NodoArbol izquierda, derecha;

    public NodoArbol(String dato, String genero) {
        this.dato = dato;
        this.genero=genero;
        this.izquierda = this.derecha = null;
    }


    public String getDato() {
        return dato;
    }
    
    public String getGenero(){
        return genero.toUpperCase();
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato()+" "+this.getGenero());
    }
    
    public void ImprimirFemenino(){
        if (this.getGenero().equals("F")) {
            System.out.println(this.getDato()+" "+this.getGenero());
        }
    }
    
    public NodoArbol getIzquierdaFemenino() {
        if (this.getGenero().equals("F")) {
            return izquierda;
        }
        return izquierda;
    }

    public void setIzquierdaFemenino(NodoArbol izquierdaF) {
        this.izquierda = izquierdaF;
    }

    public NodoArbol getDerechaFemenino() {
        if (this.getGenero().equals("F")) {
            return derecha;
        }
        return derecha;
    }

    public void setDerechaFemenino(NodoArbol derechaF) {
        this.derecha = derechaF;
    }
}
