/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Main {
    
    /*public static void main(String[] args) {
        System.out.println("Pizza 1");
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese cubierta");
        String topping= "";
        topping = lectura.nextLine();
        System.out.println("Ingrese diametro");
        float diameter ;
        diameter = lectura.nextFloat();
        System.out.println("Ingrese precio");
        float price ;
        price = lectura.nextFloat();
        
        
        Pizza p1= new Pizza(topping,diameter,price);
        
        
        System.out.println("Pizza 2");
        System.out.println("Ingrese cubierta");
        
        topping = lectura.nextLine();
        System.out.println("Ingrese diametro");
        
        diameter = lectura.nextFloat();
        System.out.println("Ingrese precio");
        price = lectura.nextFloat();
        
        
        Pizza p2= new Pizza(topping,diameter,price);
        
        System.out.println(p1.getTopping());
        
        
    }
    */
    
    Pizza[] pizzas = new Pizza[10];
    
    for(int i = 0; i < pizzas.length ;i++){
    
    
        Scanner lectura= new Scanner(System.in);
        System.out.println("Ingrese cubierta");
        String topping= "";
        topping = lectura.nextLine();
        System.out.println("Ingrese diametro");
        float diameter ;
        diameter = lectura.nextFloat();
        System.out.println("Ingrese precio");
        float price ;
        price = lectura.nextFloat();
        
        
        Pizza p1= new Pizza(topping,diameter,price);
        
        Pizzas[i]=p1;




}
    
    for(int i = 0; i < Pizzas.length ;i++){
    
    System.out.println(Pizzas[i]);

}
    
    
}
