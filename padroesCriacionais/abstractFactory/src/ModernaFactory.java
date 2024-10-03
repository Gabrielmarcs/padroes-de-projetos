public class ModernaFactory implements RoupaFactory{
    
    public ModernaFactory() {
        System.out.println("Criando uma fábrica de roupas modernas");
    }

    @Override
    public Jaqueta criarJaqueta() {
        return new Jaqueta("Jaqueta moderna", 10);
    }

    public Calca criarCalca() {
        return new Calca("Calça moderna");
    }

    public Bermuda criarBermuda() {
        return new Bermuda("Bermuda moderna");
    }

}
