
package exemplo;

public class Gerente extends Funcionario{
    double bonusFixo = 2000;
    
    public Gerente (String nome, double SalarioBase){
        super(nome,SalarioBase);
    }
    @Override
    public double calculadoraSalarioFinal(){
        return super.getSalarioBase()+bonusFixo;
    }
}
