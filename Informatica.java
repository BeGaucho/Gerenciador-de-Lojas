public class Informatica extends Loja {
    private double seguroEletronicos;
    private int quantidadeDeLojas;

// Construtor
    public Informatica (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int estoqueProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
        this.quantidadeDeLojas = 0;
    }

public Informatica(){
    //stanceoff
}

// Get & Set
public double getSeguroEletronicos (){
    return seguroEletronicos;
}
public void setSeguroEletronicos (double seguroEletronicos){
    this.seguroEletronicos = seguroEletronicos;
}

// toString
@Override
public String toString (){
    String infoLoja = super.toString();
    String infoInformatica = "Seguro para eletrônicos:" + this.getSeguroEletronicos();
        return infoLoja + "\n" + infoInformatica;
}
}