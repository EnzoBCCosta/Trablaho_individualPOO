# Exercicios de POO individual
## 👤 Identificação
* **Nome:** Enzo Bernardo Carneiro da Costa
* **Instituição:** Serratec

---

## 📋 Lista de Exercícios

### 1. Simulador de Caixa Eletrônico
**Foco:** Lógica e Estruturas de Controle.
* Implementação de menu interativo utilizando `do-while` e `switch`.
* **Regras de Negócio:**
    * Limite de 3 saques diários.
    * Valor máximo de R$ 1.000,00 por operação de saque.

### 2. Classes e Objetos (Conta Bancária)
**Foco:** Migração para Programação Orientada a Objetos (POO).
* Criação da classe `ContaBancaria` com atributos `numero`, `titular` e `saldo`.
* Encapsulamento de métodos `depositar()` e `sacar()`.
* **Regra Adicional:** Implementação de bônus de boas-vindas de R$ 50,00 aplicado via construtor.

### 3. E-commerce (Relacionamentos)
**Foco:** Composição e Agregação.
* Modelagem do relacionamento entre `Cliente`, `Pedido` e `ItemPedido`.
* **Regra de Negócio:** Método `fecharPedido()` com cálculo de frete dinâmico:
    * Total > R$ 250,00: Frete Grátis.
    * Total <= R$ 250,00: Taxa fixa de R$ 25,00.

### 4. Sistema de Veículos (Abstração e Interfaces)
**Foco:** Interfaces, Herança (Sealed Classes), Polimorfismo e Exceções.
* Implementação das interfaces `Fretavel` e `Tributavel`.
* Classe abstrata selada `Veiculo` servindo de base para `Caminhao` e `CarroPasseio`.
* **Regras de Negócio:**
    * Cálculo de IPVA baseado na idade do veículo (isento após 20 anos) e alíquotas diferenciadas (4% para carros, 1.5% para caminhões).
    * Taxa de sobrecarga de 10% para caminhões que excederem a capacidade de carga.
    * Tratamento rigoroso de exceções nos construtores e métodos.

---

## 🚀 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/](https://github.com/)[seu-usuario]/[nome-do-repositorio].git

2. dentro de cada pasta da atividade existe uma pasta chamada "**src**"
3. Execute os arquivos do **src**
