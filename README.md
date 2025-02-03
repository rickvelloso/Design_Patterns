
# Design Patterns: Estudos e Implementações

Este repositório contém exercícios, estudos e implementações práticas dos principais padrões de design em programação orientada a objetos, com foco em **Design Patterns** descritos no livro *Design Patterns: Elements of Reusable Object-Oriented Software*.

## 📋 Descrição

Este repositório abrange os seguintes padrões de criação e estruturais:

### Padrões Criacionais:
- **Singleton**
- **Factory Method**
- **Abstract Factory**
- **Prototype**
- **Builder**

### Padrões Estruturais:
- **Adapter**
- **Bridge**
- **Composite**
- **Decorator**
- **Facade**
- **Flyweight**
- **Proxy**

Cada padrão é implementado em seu próprio exercício, seguindo os princípios fundamentais e incluindo exemplos de aplicação prática.

---

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem principal para os exemplos.
- **Git**: Para versionamento do código.
- **IDE**: Recomenda-se usar IntelliJ IDEA, Eclipse ou VSCode para trabalhar no código.

---

## ✨ Padrões Implementados

### 1. **Singleton**
Garantir que apenas uma instância de uma classe exista durante todo o ciclo de vida da aplicação. Exemplos práticos:
- Gerenciamento de configurações.
- Conexões com o banco de dados.

### 2. **Factory Method**
Define uma interface para criar objetos, mas delega a responsabilidade de instanciá-los às subclasses. Exemplos:
- Criação de documentos (Contratos e Relatórios).

### 3. **Abstract Factory**
Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas. Exemplos:
- Criação de interfaces gráficas com temas claros e escuros.

### 4. **Prototype**
Permite a criação de novos objetos copiando instâncias existentes. Exemplos:
- Gerenciamento de protótipos para personagens de jogos.

### 5. **Builder**
Constrói objetos complexos passo a passo, separando a construção da representação. Exemplos:
- Construção de computadores personalizados (PC Gamer, PC para Escritório).

### 6. **Adapter**
Permite que classes com interfaces incompatíveis trabalhem juntas. Exemplos:
- Integração entre sistemas de pagamento distintos.

### 7. **Bridge**
Desacopla uma abstração de sua implementação, permitindo que ambas variem independentemente. Exemplos:
- Diferentes formas de pagamento (PayPal, Stripe) com tipos de pagamento (Cartão, Pix).

### 8. **Composite**
Permite que objetos individuais e compostos sejam tratados de maneira uniforme. Exemplos:
- Estrutura hierárquica de arquivos e pastas.

### 9. **Decorator**
Adiciona funcionalidades a objetos de maneira dinâmica. Exemplos:
- Personalização de dispositivos de exibição (PC, eReader) para diferentes formatos de livros (PDF, ePub).

### 10. **Facade**
Fornece uma interface simplificada para um conjunto complexo de subsistemas. Exemplos:
- Sistema de compras de ingressos de cinema, envolvendo subsistemas como pagamento, gerenciamento de filmes e notificações.

### 11. **Flyweight**
Usa compartilhamento para suportar grandes quantidades de objetos de granularidade fina. Exemplos:
- Representação de objetos simples, como caracteres de texto, usando um número reduzido de objetos.

### 12. **Proxy**
Fornece um objeto substituto ou representante para controlar o acesso a outro objeto. Exemplos:
- Controle de acesso a recursos em uma aplicação, como imagens ou dados de uma base de dados.

---

## 📝 Exemplos de Uso

Os exemplos de cada padrão podem ser encontrados nos diretórios correspondentes. Cada exemplo inclui:
1. Uma explicação do problema que o padrão resolve.
2. O código-fonte implementado em Java.
3. Testes básicos no método `main`.

---

## 🤔 O que Aprendi

- A importância de padrões de design para criar código escalável, legível e reutilizável.
- Como cada padrão resolve problemas específicos no design orientado a objetos.
- A aplicação prática de princípios como **SOLID** e **DRY**.

---

## 📚 Referências

- *Design Patterns: Elements of Reusable Object-Oriented Software* - Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides.
- [Padrões de Projeto - Refactoring Guru](https://refactoring.guru/design-patterns)
- Documentação oficial do Java.

---

## 🧑‍💻 Autor

**[Pedro Henrique Barreto Velloso]**
