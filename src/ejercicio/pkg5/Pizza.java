/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

/**
 *
 * @author MiguelAngel
 */
public interface Pizza {
 
    public String Salsa="TOMATE"; 
    public String Corte="REDONDO";
    public String Corte2="TRIANGULAR";
    public String Tiempo="20 Minutos"; 
    public String Empaque1="Su empaque es de carton reciclado"; 
    public String Empaque2="Su empaque es de plastico"; 
    public String Empaque3="Su empaque es una canastita";
    
    
 
    public void Prepararmasa(); 
    public void AdicionarSalsa(); 
    public void AgregarIngredientes(); 
    public void Hornear(); 
    public void Cortar(); 
    public void Empacar(); 
    
    
    
    
    
}
