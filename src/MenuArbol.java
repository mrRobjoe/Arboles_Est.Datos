
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class MenuArbol {
    private ManejaArbol arbol;
    
    public MenuArbol(){
        this.arbol=new ManejaArbol();
    }
    
    public void MostrarMenu(){
        Scanner leer=new Scanner(System.in);
        String opcionesMenu="";
        String opcion;
        
        //opciones menu
        opcionesMenu+="***Ascendencia de Carlos***\n";
        opcionesMenu+="A.Ver progenitores femeninos de Carlos.\n";
        opcionesMenu+="B.Ver en inorden, preorden o post orden la información del árbol.\n";
        opcionesMenu+="C.Agregar al árbol genealógico de Carlos.\n";
        opcionesMenu+="D.Buscar familiar ascendente.\n";
        opcionesMenu+="E.Salir.\n";
        opcionesMenu+="Digite una opción: ";
        
        this.arbol.AscendientesCarlos();
        
        //loop
        do {
            System.out.println(opcionesMenu);
            opcion=leer.nextLine().toUpperCase();
            //opcion=JOptionPane.showInputDialog(null,opcionesMenu).toUpperCase();
            switch(opcion){
                case "A":
                    System.out.println("Ascendientes femeninas: ");
                    this.arbol.AscendientesFemeninas();
                    break;
                case "B":
                    System.out.println("Recorrido InOrden");
                    this.arbol.inorden();
                    System.out.println("Recorrido PreOrden");
                    this.arbol.preorden();
                    System.out.println("Recorrido PostOrden");
                    this.arbol.postorden();
                    //
                    break;
                case "C":
                    this.arbol.AgregarMasAscendientes();
                    break;
                case "D":
                    this.arbol.BuscarFamiliar();
                    break;
                case "E":
                    break;
            }//cierre switch
            
        } while (!opcion.equals("E"));     
    }//cierre MostrarMenu
}//cierre class
