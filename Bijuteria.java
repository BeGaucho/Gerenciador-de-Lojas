public class Bijuteria extends Loja{
    private double metaVendas;
    private int quantidadeDeLojas;

// Construtor
    public Bijuteria (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas,  int estoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.metaVendas = metaVendas;
        this.quantidadeDeLojas = 0;
    }

    public Bijuteria(){
        //stanceoff
    }

// Get & Set
    public double getMetaVendas(){
        return metaVendas;
    }
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

// toString
    @Override
    public String toString() {
        String infoLoja = super.toString();
        String infoBijuteria = "Meta de vendas:" + this.getMetaVendas();
            return infoLoja + "\n" + infoBijuteria;
}
}
