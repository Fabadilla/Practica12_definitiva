/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11_git;

import java.util.Scanner;

/**
 *
 * @author administrador
 */
public class Practica11_GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        String nombre="Alvaro";
        String apellido="Fabeiro";
        System.out.println("Esto es una prueba GIT");
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("Mi apellido es: "+apellido);
        System.out.println("Dime cual es tu nombre: ");
        String tunombre=sc.nextLine();
        System.out.println("Has dicho que tu nombre es: "+tunombre);
        System.out.println("tu piensa que todos los dias sale el sol querido flopibird2");
    }
    
}
