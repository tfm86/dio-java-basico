## Modelagem e Digrama

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

### Diagrama UML (Mermaid)
```mermaid

---
title: Banco Digital
---

cclassDiagram
    class Cliente {
        - String nome
        - String cpf
        + String getNome()
        + String getCpf()
    }

    class Conta {
        # static final int AGENCIA_ID
        # static int SEQNUMERO
        # int agencia
        # int numero
        # double saldo
        # Cliente cliente
        + Conta(Cliente cliente)
        + int getAgencia()
        + int getNumero()
        + double getSaldo()
        + Cliente getCliente()
    }

    class ContaCorrente {
        + ContaCorrente(Cliente cliente)
    }

    class ContaPoupanca {
        + ContaPoupanca(Cliente cliente)
        + void renderJuros()
    }

    class Operador {
        <<interface>>
        + void sacar(double valor, Conta conta)
        + void transferir(double valor, Conta contaOrigem, Conta contaDestino)
        + void depositar(double valor, Conta contaDestino)
        + void extratoConta(Conta conta)
    }

    class OperadorConta {
        + void sacar(double valor, Conta conta)
        + void transferir(double valor, Conta contaOrigem, Conta contaDestino)
        + void depositar(double valor, Conta contaDestino)
        + void extratoConta(Conta conta)
    }

    Conta <|-- ContaCorrente
    Conta <|-- ContaPoupanca
    Operador <|.. OperadorConta
    Cliente "1" --> "1" Conta




```