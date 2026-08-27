
package pkg27.pkg08;

public class Aluno {
    private int NotaP1;
    private int NotaP2;
    private String nome;
    
    public Aluno(String nome, int NotaP1, int NotaP2){
        this.nome = nome;
        this.NotaP1 = NotaP1;
        this.NotaP2 = NotaP2;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public int getNotaP1(){
        return NotaP1;
    }
    public void setNotaP1(int NotaP1){
        this.NotaP1 = NotaP1;
    }
    public int getNotaP2(){
        return NotaP2;
    }
   public void setNotaP2(int NotaP2){
       this.NotaP2 = NotaP2;
   }

    double calcularMedia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
