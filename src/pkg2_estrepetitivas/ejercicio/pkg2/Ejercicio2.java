package pkg2_estrepetitivas.ejercicio.pkg2;

import java.util.Scanner;


public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String palabra;
        
        System.out.println("Ingrese la Palabra: ");
        Scanner teclado = new Scanner(System.in);
        palabra = teclado.next();
        
        while(!palabra.equals("salir")){
            
            System.out.println("\nLa palabra ingresada es: " + palabra);
            
            
            System.out.println("\n\nIngrese la Palabra: ");
            palabra = teclado.next();//Este es como una funcion void de un scanf en c
                                     //vuelve a preguntar lo de arriba
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
