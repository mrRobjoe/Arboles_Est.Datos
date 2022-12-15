
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class ManejaArbol {
    private NodoArbol raiz;

    public ManejaArbol() {

    }

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(NodoArbol n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getDato()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public void insertar(String dato, String genero) {
        if (this.raiz == null) {
            this.raiz = new NodoArbol(dato, genero);
        } else {
            this.insertar(this.raiz, dato, genero);
        }
    }

    private void insertar(NodoArbol padre, String dato, String genero) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoArbol(dato, genero));
            } else {
                this.insertar(padre.getDerecha(), dato, genero);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoArbol(dato, genero));
            } else {
                this.insertar(padre.getIzquierda(), dato, genero);
            }
        }
    }

    private void preorden(NodoArbol n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(NodoArbol n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(NodoArbol n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
    
    public void AscendientesCarlos(){
        /*this.insertar("Carlos","M");
        this.insertar("Maria","F");
        this.insertar("Luis","M");
        this.insertar("Ana","F");
        this.insertar("Jorge","M");
        this.insertar("Andres","M");
        this.insertar("Alicia","F");*/
        
        this.insertar("Carlos", "M");
        this.insertar("Luis", "M");
        this.insertar("Maria", "M");
        this.insertar("Ana", "M");
        this.insertar("Alicia", "F");
        this.insertar("Jorge", "F");
        this.insertar("Andres", "F");
        
        /*ver orden*/
    }
    
    public void AgregarMasAscendientes(){
        Scanner leer=new Scanner(System.in);
        String nombre="No asignado";
        String genero="No asignado";
        
        System.out.println("Digite el nombre del ascendiente: ");
        nombre=leer.nextLine();
        System.out.println("Digite el género del ascendiente, formato: F/M");
        genero=leer.nextLine();
        
        this.insertar(nombre, genero);
    }
    
    public void BuscarFamiliar(){
        Scanner leer=new Scanner(System.in);
        String buscar;
        
        System.out.println("Digite el nombre a buscar: ");
        buscar=leer.nextLine();
        
        System.out.println(this.existe(buscar));
    }
    
    private void AscendientesFemeninas(NodoArbol n){
        if (n != null) {
                n.ImprimirFemenino();
                AscendientesFemeninas(n.getDerechaFemenino());
                AscendientesFemeninas(n.getIzquierdaFemenino());
        }
    }

    public void AscendientesFemeninas(){
        this.AscendientesFemeninas(this.raiz);
    }
}//Cierre class
