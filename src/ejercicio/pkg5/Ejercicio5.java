/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner eleccion= new Scanner(System.in); 
        
        System.out.println("Bienvenido a la pizzeria");
        System.out.println("Tenemos tres sabores que le encantaran");
        System.out.println("1. Vegetariana");
        System.out.println("2. Queso");
        System.out.println("3. Peperoni");
        System.out.println("Seleccione la opcion que mas le guste");
        
        String cliente; 
        cliente= eleccion.nextLine(); 
   
        
        
        switch(cliente){
            
            case "1": 
              Vegetariana v=new Vegetariana(); 
              v.Prepararmasa(); 
              v.AdicionarSalsa(); 
              v.AgregarIngredientes(); 
              v.Hornear();
              v.Cortar();
              v.Empacar();
                
                break; 
                
            case "2": 
                Queso q=new Queso(); 
                q.Prepararmasa();
                q.AdicionarSalsa();
                q.AgregarIngredientes();
                q.Hornear();
                q.Cortar();
                q.Empacar();
                
                
                
                break; 
                
            case "3": 
                Peperoni p=new Peperoni(); 
                p.Prepararmasa();
                p.AdicionarSalsa();
                p.AgregarIngredientes();
                p.Hornear();
                p.Cortar();
                p.Empacar();
                
                break;
            
            
        }        
    }
    
}
