## Padrão de Projeto: Factory Method

Este projeto demonstra a implementação do padrão de projeto Factory Method em Java. O objetivo é mostrar como esse padrão pode ser usado para criar objetos de forma flexível e desacoplada, permitindo que subclasses decidam qual tipo de objeto criar.

## Benefícios

- **Desacoplamento:** O cliente (App) não precisa conhecer as classes concretas de Camisa ou Tenis. Ele apenas usa a fábrica (ProdutoFactory), que decide qual objeto concreto criar.

- **Extensibilidade:** Novos produtos podem ser adicionados facilmente ao sistema sem alterar o código existente. Basta criar uma nova classe de produto e uma fábrica correspondente.

- **Manutenção facilitada:** Ao centralizar a lógica de criação em fábricas, o código se torna mais fácil de manter e modificar.

- **Isolamento da lógica de criação:** A criação de objetos é isolada do código que os utiliza, seguindo o princípio da responsabilidade única