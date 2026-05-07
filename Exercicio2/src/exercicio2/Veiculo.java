
package exercicio2;


public  abstract class Veiculo {
    private String marca;
    private String modelo;
    
    public Veiculo (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract double calcularConsumo();
    
    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public void exibirInformacoes() {
        System.out.println("--- Detalhes do Veículo ---");
        System.out.println("Marca:  " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}
