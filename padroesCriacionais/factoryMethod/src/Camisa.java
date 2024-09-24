public class Camisa implements Produto {
    
    private String tipo;
    private String cor;
    private String tamanho;
    private int qtdBotoes;

    public Camisa(String tipo, String cor, String tamanho) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
        qtdBotoes = 4;
    }

    @Override
    public void mostrarDescricao() {
        System.out.println("Loja de roupas");
        System.out.println("Produto: Camisa");
        System.out.println("tipo: " + tipo + ", cor: " + cor + ", tamanho: " + tamanho + ", quantidade de botoes: " + qtdBotoes);
    }
}
