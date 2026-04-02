/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.pkg04;

/**
 *
 * @author Aluno CA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala abc = new Sala(1, " Henrique", " 2°DB");
        abc.imprimiDados();
        
        abc.alteraID(10);
        System.out.println(abc.recuperaID());
        
        abc.alteraSala("3°DB");
        System.out.println(abc.recuperasSala());
        
        abc.alteraProf("Renata");
        System.out.println(abc.recuperaProf());
    }
    
 
}
