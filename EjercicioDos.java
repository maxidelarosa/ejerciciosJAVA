/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioDos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejerciciodos {

    /**
     * @param args the command line arguments
     * se debe pedir un nombre y se debe mostrar el mismo nombre
     */
    public static void main(String[] args) {
       // TODO code application logic here
        String nombre;
        Scanner minuevoscanner = new Scanner(System.in);
        System.out.println("por ingrese su nombre");
        nombre =minuevoscanner.nextLine();
        System.out.println("el nombre ingresado es"+ nombre );
        
        
        
    }
    
}
