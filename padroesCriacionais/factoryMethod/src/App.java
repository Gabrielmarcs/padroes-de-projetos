public class App {
    public static void main(String[] args) throws Exception {
        ProdutoFactory produto = new TenisFactory();
        produto.getDescricao("tenis esportivo", "azul", "41");

        produto = new CamisaFactory();
        produto.getDescricao("camisa social", "branca", "M");
    }
}
