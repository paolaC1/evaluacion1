
import java.util.Scanner;

/*
EN ESTA PRACTICA SE VAN A REALAIZAR LAS OPERACIONES DE SUMA, RESTA, 
MULTIPLICACCION Y DIVISION DE FRACCIONES.
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
        System.out.println("Intoduce el numerador de la primera fraccción ");
        int N1;
        N1 = input.nextInt();
        
        System.out.println("Intoduce el denominador de la primera fraccción ");
        int D1;
        D1 = input.nextInt();
        
        System.out.println("Intoduce el numerador de la segunda fraccción ");
        int N2;
        N2 = input.nextInt();
        
        System.out.println("Intoduce el denominador de la segunda fraccción ");
        int D2;
        D2 = input.nextInt(); 
        
        int iSuma1;
        iSuma1 = N1 * D2 + N2 * D1;
        int iSuma2;
        iSuma2 = D1 * D2;
        
        int iResta1;
        iResta1 = N1 * D2 - N2 * D1;
        int iResta2;
        iResta2 = D1 * D2;
        
        int iMult1;
        iMult1 = N1 * N2;
        int iMult2;
        iMult2 = D1 * D2;
        
        int iDivision1;
        iDivision1 = N1 * D2;
        int iDivision2;
        iDivision2 = N2 * D1;
        
        System.out.print("El resultado de la SUMA de tus fracciones es " );
        System.out.println(iSuma1 + "/" + iSuma2 );
        System.out.print("El resultado de la RESTA de tus fracciones es ");
        System.out.println(iResta1 + "/" + iResta2);
        System.out.print("El resultado de la MULTIPLICACIÓN de tus fracciones es ");
        System.out.println(iMult1 + "/" + iMult2);
        System.out.print("Y finalmente el resultado de la DIVISIÓN de tus fracciones es ");
        System.out.println(iDivision1 + "/" + iDivision2);     
        
    }
    
}
