public class RetroFactory implements RoupaFactory {

    public RetroFactory() {
        System.out.println("Criando uma fábrica de roupas retrô");
    }

    @Override
    public Jaqueta criarJaqueta() {
        return new Jaqueta("Jaqueta retro", 5);
    }

    public Calca criarCalca() {
        return new Calca("Calça retro");
    }

    public Bermuda criarBermuda() {
        return new Bermuda("Bermuda retro");
    }
    
}
