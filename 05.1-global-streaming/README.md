# 🎬 Challenge 05.1: Global Streaming Gateway
[Português](#português) | [English](#english)

---

## Português

### 📝 Descrição do Projeto
Este é um **desafio gerado por Inteligência Artificial**, projetado para consolidar os aprendizados de controle de fluxo de forma ainda mais enxuta e profissional. Simulamos o backend de qualidade de transmissão de uma plataforma internacional de streaming (estilo Netflix/Prime Video).

O software utiliza o `switch case` para definir a resolução máxima permitida pelo plano do usuário e usa a lógica de "gavetas de prioridade" (`if/else`) para adaptar a transmissão à velocidade real de internet e ao tipo de dispositivo do usuário final.

### 🛠️ Competências Praticadas
* **Escrita de Código Limpo (Clean Code):** Eliminação de checagens redundantes de velocidade no fluxo de `else if`.
* **Clean Boolean:** Uso direto de variáveis `boolean` em condições sem comparações explícitas redundantes (como `isMobileDevice == true`).
* **Concatenação e Formatação Dinâmica:** Junção direta de valores inteiros (`maxAllowedResolution`) com texto para formatar a saída de vídeo (ex: `"2160p"`).

---

## English

### 📝 Project Description
This is an **AI-generated challenge**, designed to consolidate flow control concepts in an even leaner and more professional way. We simulated the streaming quality backend of an international platform (such as Netflix or Prime Video).

The software uses a `switch case` to map the user's subscription plan to their maximum resolution, and applies prioritized conditional logic (`if/else`) to adapt the output video quality based on real-time internet speed and device type.

### 🛠️ Key Skills Applied
* **Clean Code Practices:** Eliminating redundant range checks within the `else if` logic blocks.
* **Clean Boolean Checks:** Using logical variables directly in conditionals without redundant explicit comparisons (avoiding `isMobileDevice == true`).
* **Dynamic String Concatenation:** Merging integer values (`maxAllowedResolution`) with text to output standard video formatting (e.g., `"2160p"`).
