
package exemplo;

public class Desenvolvedor extends Funcionario {
    
    public Desenvolvedor (String nome, double SalarioBase){
        super(nome,SalarioBase);
    }
    @Override
    public double calculadoraSalarioFinal(){
        return super.getSalarioBase()* 1.1;
    }
    
}
