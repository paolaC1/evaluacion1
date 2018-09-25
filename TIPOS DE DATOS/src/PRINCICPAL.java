
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @PAOLA XOCHITL CARRILLO ORTIZ 1850693
 */
public class PRICNIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("introduce tu nombre");
        String sNombre;//DECLARANDO
        Scanner sInput;//DECLARANDO 
        //SCANNER ES UNA CLASE, PARA USAR CLASES
        //SE HACE A TRAVÉZ DE OBJETOS, Y LOS OBJETOS 
        //SE CREAN CON LA PALABRA new 
        sInput = new Scanner (System.in);
        //Scanner sInput2 = new Scanner(System.in);
        //int iVal = 10;
        sNombre = sInput.nextLine(); //CUANDO EL USUARIO DA "ENETER"
        //CONCATENAMOS CADENAS "texto" + variable tipo de texto 
        System.out.println("Tu nombre es" + sNombre); 
    }
    
}

