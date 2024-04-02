public class Cosmetico extends Loja { 
    private double taxaComercializacao;
    private int quantidadeDeLojas;

// Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int estoqueProdutos){
            super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
            this.taxaComercializacao = taxaComercializacao;
            this.quantidadeDeLojas = 0;
    }

    public Cosmetico(){
        //stanceoff
    }

// Get & Set
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
// toString
    @Override
    public String toString() {
        String infoLoja = super.toString();
        String infoCosmetico = "Taxa de comercialização:" + this.getTaxaComercializacao();
            return infoLoja + "\n" + infoCosmetico;
    }
}
