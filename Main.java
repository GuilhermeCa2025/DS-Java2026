abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract String processarPagamento();

    public String emitirRecibo() {
        return String.format("Recibo gerado no valor de R$ %.2f", this.valor);
    }
}

class PagamentoCartao extends Pagamento {
    private final String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public String processarPagamento() {
        String ultimosDigitos = this.numeroCartao.substring(this.numeroCartao.length() - 4);
        return String.format("Pagamento de R$ %.2f processado no Cartão de Crédito (Final %s).", this.valor, ultimosDigitos);
    }
}

class PagamentoPix extends Pagamento {
    private final String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public String processarPagamento() {
        return String.format("Pagamento de R$ %.2f aprovado instantaneamente via Pix para a chave %s.", this.valor, this.chavePix);
    }
}

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao(150.75, "1234567812348888");
        Pagamento pagamento2 = new PagamentoPix(50.00, "usuario@email.com");

        System.out.println(pagamento1.processarPagamento());
        System.out.println(pagamento1.emitirRecibo());

        System.out.println("----------------------------------------");

        System.out.println(pagamento2.processarPagamento());
        System.out.println(pagamento2.emitirRecibo());
    }
}
