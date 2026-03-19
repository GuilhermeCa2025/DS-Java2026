/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno CA
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pessoa henrique = new pessoa();
        System.out.println(henrique.nome);
        henrique.alteranome("Henrique");
        henrique.recuperanome();
        
        System.out.println(henrique.idade);
        henrique.alteraidade(16);
        henrique.recuperaidade();
        
        System.out.println(henrique.cpf);
        henrique.alteracpf("333.222.000-21");
        henrique.recuperacpf();
        
        
        System.out.println(henrique.vivo);
        henrique.alteraestado(true);   
        henrique.recuperaestado();
                
        
        
    }
    
}
