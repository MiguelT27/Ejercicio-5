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
public class Peperoni implements Pizza {
    String Rodajaspeperoni="Peperoni en rodajas";
    String Rodajascebolla="Cebolla en rodajas"; 
    String Quesoparmesano="Queso parmesano"; 
    String Masa; 

    
    
    @Override
    public void Prepararmasa() {
        Masa="corteza regular";
        System.out.println("Su pizza fue preparada con una masa de"+'\n'+Masa);
    }

    @Override
    public void AdicionarSalsa() {
        System.out.println("Su deliciosa salsa es de"+'\n'+Salsa);
    }

    @Override
    public void AgregarIngredientes() {
       System.out.println("Los ingredientes de su pizza son:"+'\n');
       System.out.println(Rodajascebolla);
       System.out.println(Quesoparmesano);
       System.out.println(Rodajaspeperoni);
    }

    @Override
    public void Hornear() {
        System.out.println("Su pizza demora en hornearse"+'\n'+Tiempo);
    }

    @Override
    public void Cortar() {
    System.out.println("El corte de su pizza es"+'\n'+Corte);
    }

    @Override
    public void Empacar() {
        System.out.println(Empaque2);
        
            }
    
}
