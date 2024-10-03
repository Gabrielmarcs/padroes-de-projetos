## Padrão de Projeto: Abstract Factory

O padrão Abstract Factory é um padrão de criação que permite a produção de famílias de objetos relacionados sem especificar suas classes concretas. Ele é útil quando há várias variantes de objetos e você quer garantir que todos os objetos de uma família sejam compatíveis entre si.

Benefícios

- **Consistência:** Garantimos que todas as peças de roupa criadas pertencem ao mesmo estilo.
- **Extensibilidade:** Podemos adicionar novas fábricas e novas variantes de roupas sem alterar o código existente.
- **Isolamento:** O código cliente (que usa as fábricas) não precisa conhecer as classes concretas de cada variante de roupa.