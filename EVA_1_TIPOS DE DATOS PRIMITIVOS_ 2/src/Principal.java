
import java.util.Scanner;

/*
 *Calcula el año de nacimiento, pide el nombre y la edad.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @PAOLA XOCHITL CARRILLO ORTIZ 18550693
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTURA ATRAVEZ DE UN ESCANNER 
    Scanner input = new Scanner(System.in);
    System.out.println("Escribe tu nombre");
    String sNombre;
    sNombre = input.nextLine();
    System.out.println("Escribe tu edad");
    int iEdad;
    iEdad = input.nextInt();
    int iAnno;
    iAnno = 2018 - iEdad;
    System.out.println("Su nombre es " + sNombre);
    System.out.println("Su año de nacicmiento es " + iAnno);
    }
    
}
