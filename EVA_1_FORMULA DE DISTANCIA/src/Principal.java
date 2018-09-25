
import java.util.Scanner;

/*
 * CALACULA LA DISTANCIA.
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
        Scanner input = new Scanner(System.in);         
        System.out.println("Velocidad inicial");
        double rVi;
        rVi= input.nextDouble();
        
        System.out.println("Velocidad final");
        double rVf;
        rVf = input.nextDouble();
        
        System.out.println("Tiepo");
        double rTiempo;
        rTiempo = input.nextDouble();
        
        double d;
        d = ((rVi + rVf)/2) * rTiempo;
        System.out.println("Tu distancia es " + d);
    }
    
}
