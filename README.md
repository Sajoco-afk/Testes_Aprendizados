# ☕ Testes e Estudos em Java

Repositório criado para armazenar **testes, exercícios, experimentos e pequenos programas desenvolvidos durante meus estudos de Java**.

A ideia é utilizar este espaço para registrar minha evolução na linguagem, testar conceitos novos e praticar programação por meio de exemplos simples e progressivos.

---

## 📚 Sobre o Repositório

Este repositório reúne códigos desenvolvidos principalmente para:

* 🧠 Praticar lógica de programação
* ☕ Estudar Java
* 🧪 Testar recursos e funcionalidades da linguagem
* 🔎 Entender o comportamento dos tipos de dados
* 🛠️ Experimentar diferentes formas de escrever código
* 📈 Acompanhar minha evolução durante os estudos

Os códigos podem variar bastante em complexidade, pois o objetivo principal é **aprender, testar e entender**.

---

## 🧪 Testes e Exercícios

### `PromocaoAutomatica.java`

Este programa foi desenvolvido para testar o conceito de **promoção automática de tipos (Type Promotion)** em Java.

O código utiliza diferentes tipos primitivos:

```text
byte
short
char
int
long
float
double
```

E realiza operações matemáticas entre eles para observar como o Java promove automaticamente determinados tipos durante os cálculos.

### Exemplos testados

```text
a * b
a + g
b - b
f / b
g * c
d * b
```

O objetivo é compreender melhor como o Java trabalha com **conversão e promoção de tipos durante expressões matemáticas**.

---

### `BreakContinue.java`

Exercício desenvolvido para praticar o uso das palavras-chave **`break`** e **`continue`** dentro de uma estrutura de repetição `for`.

O programa utiliza uma sequência de códigos de carteirinha de convênio médico e verifica quais códigos são aceitos pelo **Hospital Santa Clara**.

Os códigos aceitos são:

```text
3
7
10
```

### 🔄 Conceitos praticados

#### `break`

O comando `break` é utilizado para **interromper completamente o laço de repetição** quando o código da carteirinha corresponde ao código definido como saída.

Exemplo:

```java
if (codigoCarteirinha == codigoDeSaida) {
    System.out.println("Código de saída encontrado, encerrando!");
    break;
}
```

Quando essa condição é verdadeira, o `for` é encerrado imediatamente.

#### `continue`

O comando `continue` é utilizado quando o código é aceito pelo hospital.

Nesse caso, o programa apresenta a mensagem correspondente e pula o restante da iteração atual, passando para o próximo código.

Exemplo:

```java
if (codigoCarteirinha == 3 ||
    codigoCarteirinha == 7 ||
    codigoCarteirinha == 10) {

    System.out.println("Código aceito! " + codigoCarteirinha);
    continue;
}
```

### 💡 Teste realizado

Durante o exercício, o valor de `codigoDeSaida` foi alterado para diferentes números para observar como o comportamento do `break` modifica a execução do programa.

Também foi utilizado o valor:

```java
int codigoDeSaida = 11;
```

Nesse caso, como o `for` percorre somente os códigos de **1 a 10**, o código de saída não é encontrado e o laço percorre todas as iterações.

### 🎯 Objetivo do exercício

Compreender na prática a diferença entre:

```text
break    → interrompe o laço completamente
continue → pula a iteração atual e continua o laço
```

---

## 🛠️ Tecnologias

* ☕ Java
* 💻 JDK
* 🖥️ Terminal / IDE
* 🔧 Git
* 🐙 GitHub

---

## 📂 Organização

Os testes serão adicionados ao repositório conforme novos conceitos forem estudados.

```text
TestesJava/
│
├── PromocaoAutomatica.java
├── BreakContinue.java
├── Variaveis.java
├── Operadores.java
├── Condicionais.java
├── Repeticoes.java
├── Arrays.java
└── ...
```

A estrutura poderá ser modificada conforme o repositório crescer.

---

## 🎯 Objetivo

Este repositório faz parte da minha jornada de aprendizado em programação.

Aqui não estão apenas códigos "prontos": estão também **testes, erros, experimentos e tentativas** que fazem parte do processo de aprender a programar.

> **Aprender a programar é aprender a pensar.**

---

## 🚀 Evolução

Novos testes e exercícios serão adicionados conforme avanço nos estudos de Java e programação.

**Em constante desenvolvimento.** 🚧

---

## 👨‍💻 Autor

**Samuel Jorge Covalski**

Estudante de Desenvolvimento de Sistemas e entusiasta da área de tecnologia.

🐙 GitHub: [Sajoco-afk](https://github.com/Sajoco-afk)

💼 LinkedIn: [Samuel Jorge Covalski](https://www.linkedin.com/in/samuel-covalski/)

---

⭐ Este repositório representa minha evolução prática durante os estudos.
