/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.monedas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CalculadoraDeMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Lectura = new Scanner(System.in);
      double euro = 18.21;
      double dolar = 17.07;
      double yen = 0.12;
      double liblas = 21.18;
      
      System.out.println("Ingrese una cantidad de pesos");
      double pesos = Lectura.nextInt();
       System.out.println("euro " + pesos/18.21);
        System.out.println("dolar " + pesos/17.07);
        System.out.println("yen " + pesos/0.12);
         System.out.println("libras " + pesos/21.18);
      
      
      
    }
    
}
