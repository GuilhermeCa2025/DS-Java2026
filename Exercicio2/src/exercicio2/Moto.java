/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

public class Moto extends Veiculo{
    double Cilindrada;
    
    public Moto (String marca, String modelo , double Cilindrada){
        super(marca,modelo);
        this.Cilindrada=Cilindrada;
    }
    @Override
    public double calcularConsumo(){
        return 30.0 - (Cilindrada / 100.0);
    }
}