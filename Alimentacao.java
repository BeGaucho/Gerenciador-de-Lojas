public class Alimentacao extends Loja{
    private Data dataAlvara;
    private int quantidadeDeLojas;

// Construtor
    public Alimentacao (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara,  int estoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.dataAlvara = dataAlvara;
        this.quantidadeDeLojas = 0;
    }

    public Alimentacao(){
        //stanceoff
    }
    
// Get & Set
    public Data getDataAlvara (){
        return dataAlvara;
    }
    public void setDataAlvara (Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

// toString
    @Override
    public String toString (){
        String infoLoja = super.toString();
        String infoAlimentacao = "Data de alvara:" + this.getDataAlvara();
            return infoLoja + "\n" + infoAlimentacao;
}
}