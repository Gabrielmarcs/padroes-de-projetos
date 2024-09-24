public abstract class ProdutoFactory {
    public abstract Produto criarProduto(String tipo, String cor, String tamanho);

    public void getDescricao(String tipo, String cor, String tamanho){
        Produto produto = criarProduto(tipo, cor, tamanho);
        if (produto != null){
            produto.mostrarDescricao();            
        } else{
            System.out.println("Produto não encontrado");
        }
    }
}