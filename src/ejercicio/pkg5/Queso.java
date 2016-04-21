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
public class Queso implements Pizza {
    String Mozzarellafresco="Queso Mozzarella fresco"; 
    String Parmesano="Queso Parmesano"; 
    String MasaCorteza="Corteza Regular"; 
 
    
    @Override
    public void Prepararmasa() {
      System.out.println("La pizza tiene una masa de"+'\n'+MasaCorteza);
    }

    @Override
    public void AdicionarSalsa() {
        System.out.println("Se preparÃ³ su pizza con una deliciosa salsa de"+'\n'+Salsa);
    }

    @Override
    public void AgregarIngredientes() {
        System.out.println("Los ingredientes de su pizza son"+'\n'+Mozzarellafresco+'\n'+"y"+'\n'+Parmesano);    
       
    }

    @Override
    public void Hornear() {
    System.out.println("Su pizza se horneÃ³ por un tiempo de"+'\n'+Tiempo);
    }

    @Override
    public void Cortar() {
    System.out.println("El corte de su pizza es"+'\n'+Corte); 
    }

    @Override
    public void Empacar() {
           System.out.println(Empaque1);
      
    }
    
    
}
