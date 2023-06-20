/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2;

/**
 *
 * @author Ignacio Gaynor
 */
public class Complejo {
    public double parteReal;
    public double parteImaginaria;

    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
     public double getReal(){
         return parteReal;
     }
     public double getImaginario(){
         return parteImaginaria;
     }
     
     public Complejo Suma(Complejo segundoNumero) {
        double sumaReal = this.parteReal + segundoNumero.parteReal;
        double sumaImaginaria = this.parteImaginaria + segundoNumero.parteImaginaria;
        return new Complejo(sumaReal, sumaImaginaria);
    }
     
     public Complejo Resta (Complejo segundoNumero)
     {
          double diferenciaReal = this.parteReal - segundoNumero.parteReal;
        double diferenciaImaginaria = this.parteImaginaria - segundoNumero.parteImaginaria;
        return new Complejo(diferenciaReal, diferenciaImaginaria);
     }
     
     public Complejo multiplicacion(Complejo segundoNumero) {
        double productoReal = (this.parteReal * segundoNumero.parteReal) - (this.parteImaginaria * segundoNumero.parteImaginaria);
        double productoImaginario = (this.parteReal * segundoNumero.parteImaginaria) + (this.parteImaginaria * segundoNumero.parteReal);
        return new Complejo(productoReal, productoImaginario);
    }
     public Complejo Division(Complejo SegundoNumero){
          double divisor = (SegundoNumero.parteReal * SegundoNumero.parteReal) + (SegundoNumero.parteImaginaria * SegundoNumero.parteImaginaria);
        double CocienteReal = ((this.parteReal * SegundoNumero.parteReal) + (this.parteImaginaria * SegundoNumero.parteImaginaria)) / divisor;
        double CocienteImaginario = ((this.parteImaginaria * SegundoNumero.parteReal) - (this.parteReal * SegundoNumero.parteImaginaria)) / divisor;
        return new Complejo(CocienteReal, CocienteImaginario);
     }

    @Override
 public String toString() {
        if (parteImaginaria >= 0) {
            return parteReal + " + " + parteImaginaria + "i";
        } else {
            return parteReal + " - " + Math.abs(parteImaginaria) + "i";
        }
    }

}
