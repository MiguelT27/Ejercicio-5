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
public class Vegetariana implements Pizza {
    String Mozzarela="Queso Mozzarella"; 
    String Parmesanorallado="Queso parmesano rallado"; 
    String Cebollapicada="Cebolla picada"; 
    String Hongosrebanadas="Hongos en rebanadas"; 
    String Pimienta="Pimienta"; 
    private String Aceitunas ="Aceitunas negras"; 
    private String Masa="Regular";

    public Vegetariana(String Mozzarela, String Parmesanorallado, String Cebollapicada, String Hongosrebanadas, String Pimienta, String Aceitunas, String Masa) {
        this.Mozzarela = Mozzarela;
        this.Parmesanorallado = Parmesanorallado;
        this.Cebollapicada = Cebollapicada;
        this.Hongosrebanadas = Hongosrebanadas;
        this.Pimienta = Pimienta;
        this.Aceitunas = Aceitunas;
        this.Masa = Masa;
    }

    Vegetariana() {
    }   
   

    @Override
    public void Prepararmasa() {
      System.out.println("Se prepara la masa tipo"+'\n'+Masa); 
    }

    @Override
    public void AdicionarSalsa() {
        System.out.println("Se preparÃ³ su pizza con una deliciosa salsa de"+'\n'+Salsa); 
    }

    @Override
    public void AgregarIngredientes() {
     System.out.println("Se agregaron los ingredientes");
     System.out.println(Mozzarela);
     System.out.println(Parmesanorallado);
     System.out.println(Cebollapicada );
    
    System.out.println(Hongosrebanadas); 
    System.out.println(Pimienta); 
   
     
    }

    @Override
    public void Hornear() {
         System.out.println("Su pizza demora horneandose"+'\n'+Tiempo);
     
    }

    @Override
    public void Cortar() {
       System.out.println("El corte de la pizza es"+'\n'+Corte2);
    }

    @Override
    public void Empacar() {
        System.out.println(Empaque3); 
            }

    public String getAceitunas() {
        return Aceitunas;
    }

    public String getMasa() {
        return Masa;
    }
    
    
}
