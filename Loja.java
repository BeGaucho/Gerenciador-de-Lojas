public class Loja{
        private String nome;
        private int quantidadeFuncionarios;
        private double salarioBaseFuncionario;
        private Endereco endereco;
        private Data dataFundacao;
        private Produto[] estoqueProdutos;
        private int quantidadeDeLojas;

//Construtor que inicializa todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
        this.quantidadeDeLojas = 0;
    }

    public Loja(){  
    //instanceoff
    }

// Construtor que recebe, nome, quantidade de funcionários, endereço e data   
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios =  quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
        this.quantidadeDeLojas = 0;
        
    }   

// Getters & Setters para todos atributos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Data getDataFundacao(){
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }
    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

// Métodos do Produto
    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto.toString());
            }
        }
    }

    public boolean insereProduto(Produto novoProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = novoProduto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

// Método toString com todos atributos
    @Override
        public String toString() {
            return "Nome: " + this.getNome() + "\nQuantidade de funcionários: " + this.getQuantidadeFuncionarios() + "\nSalário base dos funcionários: " + this.getSalarioBaseFuncionario() + "\nEndereço:" + this.getEndereco() + "\nData de fundação:" + this.getDataFundacao() + "\n Estoque de produtos:" + this.getEstoqueProdutos();
    }

// Método para calcular gastos com salário dos funcionários 
    public double gastosComSalario() {
            if (salarioBaseFuncionario == -1) {
                return -1; // Não é possível calcular
            } else {
                return quantidadeFuncionarios * salarioBaseFuncionario;
            }
        }

// Método para o tamanho da loja
    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30 ){
            return 'M';
        } else {
            return 'G';
        }
    } 
}