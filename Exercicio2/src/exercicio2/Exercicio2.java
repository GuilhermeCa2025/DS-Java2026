/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author Aluno CA
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Carro Car = new Carro ("5" , "10" , 2000);
        Car.exibirInformacoes();
        System.out.println(Car.calcularConsumo()); 
        
        Moto Mot = new Moto ("7" , "13" , 1500);
        Mot.exibirInformacoes();
        System.out.println(Mot.calcularConsumo()); 
        
        Caminhao Camin = new Caminhao ("2" , "11" , 500 );
        Camin.exibirInformacoes();
        System.out.println(Camin.calcularConsumo()); 
        
    }
    
}
