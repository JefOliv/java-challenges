# Challenge 03: Inventory Control System 📦

[Read in English](#english-version) | [Ler em Português](#versao-em-portugues)

---

## English Version

### 📝 Scenario & Goal
This project simulates a warehouse management system feature. The goal was to receive an incoming bulk load of a product with decimal values, calculate how many whole commercial packages could be created using **Explicit Casting**, and determine the exact remaining weight (residue).

### ⚙️ Requirements
- Apply explicit casting `(int)` to truncate decimals and get only whole units.
- Avoid using Java reserved words for variable names.
- Calculate the mathematically correct remaining residue.
- Document the code using both single-line (`//`) and multi-line (`/* ... */`) comments.

### 🛠️ Core Concepts Practiced
- **Explicit Casting:** Converting a `double` to an `int` when there is a risk of losing information (truncating decimal places).
- **Reserved Words:** Understanding that specific keywords like `class` or `public` cannot be used as variable identifiers.
- **Mathematical Logic:** Implementing a remainder formula to extract leftover fractional data.

---

## Versão em Português

### 📝 Cenário & Objetivo
Este projeto simula uma funcionalidade de um sistema de controle de estoque de um centro de distribuição. O objetivo foi receber uma carga bruta de um produto com valores decimais, calcular quantos pacotes comerciais inteiros poderiam ser gerados utilizando **Casting Explícito** e determinar o peso exato restante que sobrou (resíduo).

### ⚙️ Requisitos do Desafio
- Aplicar o casting explícito `(int)` para descartar as casas decimals e obter apenas unidades inteiras.
- Evitar o uso de palavras reservadas do Java no nome das variáveis.
- Calcular matematicamente o resíduo correto que sobrou após a divisão.
- Praticar a documentação utilizando comentários de linha única (`//`) e em bloco (`/* ... */`).

### 🛠️ Conceitos Principais Praticados
- **Casting Explícito:** Conversão manual de um tipo `double` para `int` quando existe o risco de perda de informação (descarte das casas decimais).
- **Palavras Reservadas:** Compreensão de que termos nativos da linguagem não podem ser utilizados para nomear variáveis.
- **Lógica Matemática:** Criação de uma fórmula de resto para extrair com precisão os quilos que não completaram um pacote inteiro.
