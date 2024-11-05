## Conta Bancária - Generation Brasil

Este projeto é uma aplicação Java que simula operações básicas de um sistema bancário. O objetivo é fornecer uma implementação simples de contas bancárias, incluindo contas correntes e poupança, com funcionalidades como saque, depósito, transferência e visualização de saldo. A aplicação segue o padrão MVC (Model-View-Controller) e utiliza conceitos de orientação a objetos, como herança e polimorfismo, para estruturar o código de forma modular e reutilizável.

<details>
    <summary>Imagens</summary>
    <div aling="center">
        <img src="public/img/padraomvc.png" width="150px">
        <img src="public/img/menu.png" width="200px">
        <img src="public/img/sobre.png" width="200px">
    </div>
</details>

<details>
    <summary>Diagrama de Classe e Objeto</summary>

```java
classDiagram
class Conta {
<<Abstract>>
    - numero : int
    - agencia : int
    - tipo : int
    - titular : String
    - saldo : float
    + int getNumero()
    + int getAgencia()
    + int getTipo()
    + String getTitular()
    + float getSaldo()
    + void setNumero(int numero)
    + void setAgencia(int agencia)
    + void setTipo(int tipo)
    + void setTitular(String titular)
    + void setSaldo(float saldo)
    + boolean sacar(float valor)
    + void depositar(float valor)
    + void visualizar()
}
class ContaCorrente {
    - limite : float
    + float getLimite()
    + void setLimite(float limite)
    + boolean sacar(float valor)
    + void visualizar()
}
class ContaPoupanca {
    - aniversario : int
    + int getAniversario()
    + void setAniversario(int aniversario)
    + void visualizar()
}
class ContaRepository{
    << Interface >>
    + void procurarPorNumero(int numero)
    + void listarTodas()
    + void cadastrar(Conta conta)
    + void atualizar(Conta conta)
    + void deletar(int numero)
    + void sacar(int numero, float valor)
    + void depositar(int numero, float valor)
    + void transferir(int numeroOrigem, int numeroDestino, float valor)
}
class ContaController{
    + void procurarPorNumero(int numero)
    + void listarTodas()
    + void cadastrar(Conta conta)
    + void atualizar(Conta conta)
    + void deletar(int numero)
    + void sacar(int numero, float valor)
    + void depositar(int numero, float valor)
    + void transferir(int numeroOrigem, int numeroDestino, float valor)
    + int gerarNumero()
    + Conta buscarNaCollection(int numero)
}

Conta <|-- ContaCorrente
Conta <|-- ContaPoupanca
Conta <.. ContaRepository
ContaRepository <|.. ContaController
```

</details>