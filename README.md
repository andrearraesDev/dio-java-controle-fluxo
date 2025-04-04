🚀 Sistema de Processamento de Pedidos
===============================================================

Implementação de um sistema para simular o processamento de pedidos, com validação de intervalo e tratamento de exceções customizadas.

📝 Descrição do Projeto
-----------------------

*   Valida se o ID final é maior que o inicial
*   Lança exceção personalizada caso os IDs sejam inválidos
*   Calcula a quantidade total de pedidos a processar
*   Simula o processamento de cada pedido individualmente
*   Exibe mensagens amigáveis com cabeçalho e rodapé no terminal

⚙️ Funcionalidades
------------------

*   Validação de intervalo de IDs
*   Simulação de tempo de processamento com `Thread.sleep`
*   Exceções customizadas
*   Interface interativa no terminal

🛠️ Tecnologias
---------------

*   Java 17+
*   Git/GitHub
*   NetBeans (ou qualquer IDE Java)

📦 Estrutura do Projeto
-----------------------

    
    src/
    ├── ProcessadorDePedidos.java         # Classe principal com toda a lógica do sistema
    └── IntervaloInvalidoException.java   # Exceção customizada para validar o intervalo
      

▶️ Como Executar
----------------

1.  Clone o repositório:
    
        git clone https://github.com/andrearraesDev/dio-java-controle-fluxo.git
    
2.  Compile e execute:
    
        javac src/*.java
        java -cp src ProcessadorDePedidos
    
3.  Siga as instruções no terminal:
    
        Digite o ID inicial do pedido: 100
        Digite o ID final do pedido: 105
    

📊 Exemplo de Saída
-------------------

**Caso válido (100 a 105):**

    
    ============================================
          SISTEMA DE PROCESSAMENTO DE PEDIDOS
    ============================================
    
    --------------------------------------------
    
    Iniciando o processamento de 6 pedidos...
    
    Processando pedido #100...
    Processando pedido #101...
    Processando pedido #102...
    Processando pedido #103...
    Processando pedido #104...
    Processando pedido #105...
    
    Todos os pedidos foram processados com sucesso!
    
    --------------------------------------------
    Desenvolvido por André Arraes
    Projeto demonstrativo - Portfólio Java
    --------------------------------------------
      

**Caso inválido (105 a 100):**

    Erro: O ID final deve ser maior que o ID inicial.

🧠 Conceitos Aplicados
----------------------

*   Controle de fluxo com loops `for`
*   Criação e uso de exceções personalizadas
*   Manipulação de entrada via `Scanner`
*   Boas práticas com tratamento de recursos e mensagens claras no terminal

* * *

**Desenvolvido por André Arraes** como parte da Trilha Java Básico da [Digital Innovation One](https://www.dio.me).
