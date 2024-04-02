public class Produto {
        private String nome;
        private double preco;
        private Data dataValidade;

// Construtor que inicializa todos os atributos
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

// Getters & Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public Data getDataValidade(){
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

//Método produto vencido
    public boolean estaVencido(Data dataAtual) {
        if (dataValidade.getAno() < dataAtual.getAno()) {
            return true;
        }
        if (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() < dataAtual.getMes()) {
            return true;
        }
        if (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia()) {
            return true;
        }
        return false;
    }

// toString
    @Override
        public String toString(){
            return "Nome" + this.getNome() + "\nValor:" + this.getPreco() + "\nValidade:" + this.getDataValidade();
    }
}
