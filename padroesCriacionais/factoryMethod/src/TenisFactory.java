public class TenisFactory extends ProdutoFactory {
    @Override
    public Produto criarProduto(String tipo, String cor, String tamanho) {
        return new Tenis(tipo, cor, tamanho);
    }
    
}
