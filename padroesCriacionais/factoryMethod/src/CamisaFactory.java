public class CamisaFactory extends ProdutoFactory {
    @Override
    public Produto criarProduto(String tipo, String cor, String tamanho) {
        return new Camisa(tipo, cor, tamanho);
    }
    
}
