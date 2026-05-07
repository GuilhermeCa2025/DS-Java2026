/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;
public class Caminhao extends Veiculo{
    double capacidadeCarga;
    
    public Caminhao (String marca, String modelo , double capacidadeCarga){
        super(marca,modelo);
        this.capacidadeCarga=capacidadeCarga;
    }
    @Override
    public double calcularConsumo(){
        return 5.0 - (capacidadeCarga / 1000.0) ;
    }
}
