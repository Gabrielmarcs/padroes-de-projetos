public class Tenis implements Produto {
    
    private String tipo;
    private String cor;
    private String tamanho;

    public Tenis(String tipo, String cor, String tamanho) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public void mostrarDescricao() {
        System.out.println("Loja de calçados");
        System.out.println("Produto: Tênis");
        System.out.println("cor: " + cor + ", tamanho: " + tamanho + ", tipo: " + tipo);
    }
}
