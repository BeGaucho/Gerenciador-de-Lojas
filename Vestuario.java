public class Vestuario extends Loja {
    private boolean produtosImportados;
    private int quantidadeDeLojas;

// Construtor
    public Vestuario (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int estoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.produtosImportados = produtosImportados;
        this.quantidadeDeLojas = 0;
    }

    public Vestuario(){
        //stanceoff
    }

// Get & Set
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

// toString
    @Override
    public String toString() {
        String infoLoja = super.toString();
        String infoVestuario = "Produtos Importados: " + (produtosImportados ? "Sim" : "Não");
            return infoLoja + "\n" + infoVestuario;
    }
}