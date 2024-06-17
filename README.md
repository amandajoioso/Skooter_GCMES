# Skooter_GCMES

## UNIVERSIDADE DE SÃO PAULO
**ICMC - INSTITUTO DE CIÊNCIAS MATEMÁTICAS E COMPUTAÇÃO**

**SSC0535 - Gerência de Configuração, Manutenção e Evolução de Software**  
Prof. Dra. Rosana Teresinha Vaccare Braga  
Prof. Dra. Lina Maria Garces Rodriguez

**Projeto - Parte 2**  
**Relatório Parcial**

**Amanda Joioso - 4818232**  
**Fernando Lopes - 12725515**  
**Luiz Belorio - 12563814**  
**Paulo Turquetti - 13750791**

São Carlos  
Junho de 2024

---

## Sumário
1. [Repositório do Projeto](#repositório-do-projeto)
2. [Política de Branching e Merging](#política-de-branching-e-merging)
3. [Pipeline de CI/CD](#pipeline-de-cicd)
   - [Introdução](#introdução)
   - [Descrição do Pipeline CI/CD](#descrição-do-pipeline-cicd)
   - [Tecnologias Utilizadas](#tecnologias-utilizadas)
   - [Responsável pelo Pull Request](#responsável-pelo-pull-request)
   - [Etapas do Pipeline](#etapas-do-pipeline)
4. [Análise Preliminar de Qualidade de Código](#análise-preliminar-de-qualidade-de-código)
   - [Testes Criados](#testes-criados)
   - [Categorias e Atributos do Código](#categorias-e-atributos-do-código)
   - [Severidade](#severidade)
   - [Detalhes das Questões Identificadas](#detalhes-das-questões-identificadas)
   - [Análise Geral](#análise-geral)
   - [Passos Seguintes](#passos-seguintes)
5. [Instruções para Execução do Projeto](#instruções-para-execução-do-projeto)
6. [Contribuindo](#contribuindo)
7. [Licença](#licença)

---

## Repositório do Projeto
Para esse projeto, utilizamos um jogo desenvolvido em Java na disciplina de Programação Orientada a Objetos. O projeto é chamado Skooter e pode ser acessado [aqui](URL_DO_REPOSITORIO).

O jogo Skooter consiste em cinco fases onde o objetivo é coletar todos os objetos especiais do mapa enquanto evita adversários e obstáculos. O jogador deve passar por todas as fases com apenas três vidas.

---

## Política de Branching e Merging
Utilizaremos a política GitHub Flow para implementar mudanças no jogo Skooter. A branch principal `main` conterá o código de produção estável, enquanto novas funcionalidades e correções serão desenvolvidas em branches específicas.

### Estrutura de Branches
- **Main:** Código estável e pronto para produção.
- **Develop:** Integração de funcionalidades antes de serem mescladas na `main`.
- **Feature:** Desenvolvimento de novas funcionalidades a partir de `develop`.
- **Refactor:** Refatoração do código existente a partir de `develop`.

### Regras de Merge
Para mesclar na branch `main`, é exigido um pull request aprovado por Amanda, garantindo controle de qualidade consistente.

---

## Pipeline de CI/CD
### Introdução
O objetivo do pipeline de CI/CD é automatizar e otimizar o processo de integração e entrega contínua do projeto.

### Descrição do Pipeline CI/CD
Utilizamos GitHub Actions para configurar o pipeline de CI/CD, integrado com SonarCloud para análise contínua de qualidade do código.

### Tecnologias Utilizadas
- **GitHub Actions:** Orquestração do pipeline de CI/CD.
- **Maven:** Construção e gerenciamento de dependências do projeto Java.
- **SonarCloud:** Análise estática do código e métricas de qualidade.

### Responsável pelo Pull Request
Amanda é a responsável por aprovar pull requests na branch principal (`main`).

### Etapas do Pipeline
1. **Checkout do Código:**
   Utilizamos `actions/checkout@v3` para obter o código fonte do repositório.

2. **Configuração do Ambiente:**
   - Configuração do JDK 17 usando `actions/setup-java@v3`.
   - Configuração de caches para dependências do Maven e SonarCloud.

3. **Build e Análise:**
   - Compilar o projeto utilizando Maven (`mvn verify`).
   - Executar testes e análise do código com o plugin SonarCloud (`sonar-maven-plugin`).

4. **Publicação dos Resultados:**
   Os resultados da análise são enviados para o SonarCloud.

---

## Análise Preliminar de Qualidade de Código
### Testes Criados
- **Main.java**
  - **Localização:** `src/main/java/com/example/Skooter/Main.java`
  - **Descrição:** Ponto de entrada principal do programa.

- **Musica.java**
  - **Localização:** `src/main/java/com/example/Skooter/Musica.java`
  - **Descrição:** Classe responsável por carregar e controlar a reprodução de arquivos de áudio.

- **MusicaTest.java**
  - **Localização:** `src/test/java/com/example/Skooter/MusicaTest.java`
  - **Descrição:** Testes unitários para a classe Musica.

- **ControleDeJogo.java**
  - **Localização:** `src/main/java/com/example/Skooter/Controler/ControleDeJogo.java`
  - **Descrição:** Controla a lógica do jogo.

- **ControleDeJogoTest.java**
  - **Localização:** `src/test/java/com/example/Skooter/Controler/ControleDeJogoTest.java`
  - **Descrição:** Testes unitários para a classe ControleDeJogo.

### Categorias e Atributos do Código
- **Consistency:** 18 issues
- **Intentionality:** 68 issues
- **Adaptability:** 24 issues
- **Responsibility:** 1 issue

### Severidade
- **High:** 42 issues
- **Medium:** 27 issues
- **Low:** 42 issues

### Detalhes das Questões Identificadas
- **Responsibility (Security):**
  - **Issue:** "Make sure this SonarQube token gets revoked, changed, and removed from the code."
  - **Severidade:** Blocker

- **Consistency (Maintainability):**
  - **Issue:** "Rename this package name to match the regular expression..."
  - **Severidade:** Minor

- **Intentionality (Maintainability):**
  - **Issue:** "Add a private constructor to hide the implicit public one."
  - **Severidade:** Major

### Análise Geral
- **Security:** Crítico resolver o problema do token SonarQube exposto.
- **Maintainability:** Melhorar a consistência e manutenibilidade do código.
- **Consistency:** Seguir padrões consistentes para facilitar a manutenção.

### Passos Seguintes
1. **Correção de Segurança:** Atualizar o código para remover o token exposto.
2. **Refatoração:** Melhorar a consistência e manutenibilidade do código.
3. **Revisão e Testes:** Realizar nova análise e testes para garantir que as issues foram resolvidas.

---

## Instruções para Execução do Projeto
### Pré-requisitos
- [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Apache Maven](https://maven.apache.org/install.html)
- [Git](https://git-scm.com/downloads)

### Clonando o Repositório
```bash
git clone <URL_DO_REPOSITORIO>
cd Skooter_GCMES

### Executando os Testes Localmente
```bash
mvn clean verify

### Configurando o Sonar Cloud:
<properties>
    <sonar.projectKey>amandajoioso_Skooter_GCMES</sonar.projectKey>
    <sonar.organization>gcmes-grupo6</sonar.organization>
    <sonar.host.url>https://sonarcloud.io</sonar.host.url>
    <sonar.login>${env.SONAR_TOKEN}</sonar.login>
</properties>

###Configure a variável de ambiente SONAR_TOKEN:
setx SONAR_TOKEN "seu-token-aqui"
export SONAR_TOKEN="seu-token-aqui"

### Executando a Análise do SonarCloud
mvn verify sonar:sonar

### Executando o jogo
mvn exec:java -Dexec.mainClass="com.example.Skooter.Main"


