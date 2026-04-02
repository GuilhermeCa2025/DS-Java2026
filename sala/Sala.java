/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.pkg04;

/**
 *
 * @author Aluno CA
 */
public class Sala {
  int id_sala;
  String nome_prof;
    String nome_Sala;
    Sala(int id_sala, String nome_prof, String nome_Sala){
        this.id_sala = id_sala;
        this.nome_Sala = nome_Sala;
        this.nome_prof = nome_prof;
    }
    
    void imprimiDados(){
        System.out.println("id da sala:" + id_sala + "\n" + "nome do prof:" + nome_prof + "\n" + "nome do Sala" + nome_Sala);
    }
    
    void alteraID(int id_sala){
        this.id_sala = id_sala;
    }
    
    int recuperaID(){
        return id_sala;
    }
    
    void alteraSala(String nome_Sala){
        this.nome_Sala = nome_Sala;
    }
    
    String recuperasSala(){
        return nome_Sala;
}
     
    void alteraProf(String nome_prof){
        this.nome_prof = nome_prof;
    }
    
    String recuperaProf(){
        return nome_prof;
}
}
