/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora operacion = new Calculadora();
        int opcion,opcion2,opcion3;
        do{
             System.out.println("QUE TIPO DE NUMERO DESEA USAR PARA REALIZAR LOS CALCULOS?");
        System.out.println("OPCION 1: REAL");
        System.out.println("OPCION 2 FLOTANTE");
        System.out.println("OPCION 3 COMPLEJO");
        Scanner lector = new Scanner(System.in);
        opcion = lector.nextInt();
        switch(opcion){
            case 1:
                int a,b;
                System.out.println(" 1: SUMA \n 2:RESTA \n 3:MULTIPLICACION \n 4:DIVISION");
            opcion2 = lector.nextInt();
            if(opcion2 == 1){
                System.out.println("ingrese el primer numero");
                a=lector.nextInt();
                System.out.println("ingrese el segundo numero");
                b=lector.nextInt();
                int resultado = a+b;
                System.out.println("el resultado de la suma es de: " + resultado);
                System.out.println("\t");
            }
              if(opcion2 == 2){
                System.out.println("ingrese el primer numero");
                a=lector.nextInt();
                System.out.println("ingrese el segundo numero");
                b=lector.nextInt();
                int resultado = a-b;
                System.out.println("el resultado de la resta es de: " + resultado);
                System.out.println("\t");
            }
                if(opcion2 == 3){
                System.out.println("ingrese el primer numero");
                a=lector.nextInt();
                System.out.println("ingrese el segundo numero");
                b=lector.nextInt();
                int resultado = a*b;
                System.out.println("el resultado de la multiplicacion es de: " + resultado);
                System.out.println("\t");
            }
                  if(opcion2 == 4){
                System.out.println("ingrese el primer numero");
                a=lector.nextInt();
                System.out.println("ingrese el segundo numero");
                b=lector.nextInt();
                int resultado = a/b;
                System.out.println("el resultado de la division es de: " + resultado);
                System.out.println("\t");
            }
            break;
            case 2:
                float c,d;
    System.out.println(" 1: SUMA \n 2:RESTA \n 3:MULTIPLICACION \n 4:DIVISION");
     opcion2 = lector.nextInt();
              if(opcion2 == 1){
                System.out.println("ingrese el primer numero");
                c=lector.nextFloat();
                System.out.println("ingrese el segundo numero");
                d=lector.nextFloat          ();
                float resultado = c+d;
                System.out.println("el resultado de la suma es de: " + resultado);
                System.out.println("\t");
            }
              if(opcion2 == 2){
                System.out.println("ingrese el primer numero");
                c=lector.nextFloat();
                System.out.println("ingrese el segundo numero");
                d=lector.nextFloat();
                float resultado = c-d;
                System.out.println("el resultado de la resta es de: " + resultado);
                System.out.println("\t");
            }
                if(opcion2 == 3){
                System.out.println("ingrese el primer numero");
                c=lector.nextFloat();
                System.out.println("ingrese el segundo numero");
                d=lector.nextFloat();
                float resultado = c*d;
                System.out.println("el resultado de la multiplicacion es de: " + resultado);
                System.out.println("\t");
            }
                  if(opcion2 == 4){
                System.out.println("ingrese el primer numero");
                c=lector.nextFloat();
                System.out.println("ingrese el segundo numero");
                d=lector.nextFloat();
                float resultado = c/d;
                System.out.println("el resultado de la division es de: " + resultado);
                System.out.println("\t");
            }
                  break;
            case 3:
               System.out.print("Ingrese la parte real del primer número complejo: ");
        double real1 = lector.nextDouble();
        System.out.print("Ingrese la parte imaginaria del primer número complejo: ");
        double imaginario1 = lector.nextDouble();
         Complejo alfa = new Complejo(real1,imaginario1);
         //AHORA VA EL SEGUNDO NUMERO COMPLEJO
             System.out.print("Ingrese la parte real del primer número complejo: ");
        double real2 = lector.nextDouble();
        System.out.print("Ingrese la parte imaginaria del primer número complejo: ");
        double imaginario2 = lector.nextDouble();
         Complejo Beta = new Complejo(real2,imaginario2);
                    System.out.println(" 1: SUMA \n 2:RESTA \n 3:MULTIPLICACION \n 4:DIVISION");
     opcion3 = lector.nextInt();
                if(opcion3 == 1){
                     Complejo Sumatoria = alfa.Suma(Beta);
                      System.out.println("EL RESULTADO DE LA SUMA ES DE " + Sumatoria.toString());
                      
                    /* System.out.print("Ingrese la parte real del primer número complejo: ");
        double real1 = lector.nextDouble();
        System.out.print("Ingrese la parte imaginaria del primer número complejo: ");
        double imaginario1 = lector.nextDouble();
         Complejo alfa = new Complejo(real1,imaginario1);
         //AHORA VA EL SEGUNDO NUMERO COMPLEJO
             System.out.print("Ingrese la parte real del primer número complejo: ");
        double real2 = lector.nextDouble();
        System.out.print("Ingrese la parte imaginaria del primer número complejo: ");
        double imaginario2 = lector.nextDouble();
         Complejo Beta = new Complejo(real2,imaginario2);
         Complejo Sumatoria = alfa.Suma(Beta);
                    System.out.println("EL RESULTADO DE LA SUMA ES DE " + Sumatoria.toString());*/
                    
                }
                if(opcion3 == 2){
                    Complejo Resta = alfa.Resta(Beta);
                    System.out.println("EL RESULTADO DE LA RESTA ES DE " + Resta.toString());
                }
                if(opcion == 3){
                    Complejo Multiplicacion = alfa.multiplicacion(Beta);
                    System.out.println("EL RESULTADO DE LA MULTIPLICACION ES DE " + Multiplicacion.toString());
                }
                if(opcion == 4){
                    Complejo Division = alfa.Division(Beta);
                    System.out.println("EL RESULTADO DE LA DIVISION ES DE " + Division.toString());
                }
                break;
                
        }
        }
        while(opcion!=4);
       
        
     
      
        
        
        
    }
    
}
