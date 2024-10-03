public class App {
    public static void main(String[] args) throws Exception {
        RoupaFactory modernaFactory = new ModernaFactory();
        
        Jaqueta jaquetaModerna = modernaFactory.criarJaqueta();
        Calca calcaModerna = modernaFactory.criarCalca();
        Bermuda bermudaModerna = modernaFactory.criarBermuda();

        System.out.println("Jaqueta moderna: " + jaquetaModerna.getNome() + " quantidade de botoes: " + jaquetaModerna.getQtdBotoes());
        System.out.println("Calça moderna: " + calcaModerna.getNome());
        System.out.println("Bermuda moderna: " + bermudaModerna.getNome());
        
        RoupaFactory retroFactory = new RetroFactory();
        
        Jaqueta jaquetaRetro = retroFactory.criarJaqueta();
        Calca calcaRetro = retroFactory.criarCalca();
        Bermuda bermudaRetro = retroFactory.criarBermuda();
        
        System.out.println("Jaqueta retro: " + jaquetaRetro.getNome() + " quantidade de botoes: " + jaquetaRetro.getQtdBotoes());
        System.out.println("Calça retro: " + calcaRetro.getNome());
        System.out.println("Bermuda retro: " + bermudaRetro.getNome());
    }
}
