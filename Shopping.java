public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

// Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }


// Get & Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }

// toString
    @Override
        public String toString() {
            return "Nome do Shopping: " + this.getNome() + "Endereço: " + this.getEndereco() + "Lojas no Shopping: " + this.getLojas();
    }

// Métodos

    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidadeDeLojas = 0;
        Loja tipoLojaObj = null;
        switch (tipoLoja) {
            case "Cosmético":
                tipoLojaObj = new Cosmetico();
                break;
            case "Vestuário":
                tipoLojaObj = new Vestuario();
                break;
            case "Bijuteria":
                tipoLojaObj = new Bijuteria();
                break;
            case "Alimentação":
                tipoLojaObj = new Alimentacao();
                break;
            case "Informática":
                tipoLojaObj = new Informatica();
                break;
            default:
                return -1;
        }
        for (Loja loja : lojas) {
            if (loja.getClass() == tipoLojaObj.getClass()) {
                quantidadeDeLojas++;
            }
        }
        return quantidadeDeLojas;
    }

    public Informatica lojaSeguroMaisCaro () {
        Loja lojaMaisCara = null;
        double valorMaisAlto = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica informatica) {
                if (informatica.getSeguroEletronicos() > valorMaisAlto) {
                    valorMaisAlto = informatica.getSeguroEletronicos();
                    lojaMaisCara = loja;
                }
            }
        }
        return (Informatica) lojaMaisCara;
    }
}