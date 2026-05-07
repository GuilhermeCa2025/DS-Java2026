/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

public abstract class Funcionario {
    private String nome;
    private double SalarioBase;
    
    public Funcionario (String nome, double SalarioBase){
        this.nome = nome;
        this.SalarioBase = SalarioBase;
    }
    public abstract double calculadoraSalarioFinal();
    
    public String getNome (){
        return nome;
    }
    public double getSalarioBase(){
        return SalarioBase;
    }
}
