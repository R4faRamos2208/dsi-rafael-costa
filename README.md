# Desenvolvimento de Software I

  

Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java.

  
  

## Como instalar o GIT no Windows

  

Para configurar o GIT no Windows é necessário fazer a instalação dele, uma vez que, diferente do linux, ele não vem instalado previamente

  

Para instalar, basta acessar o site clicando no link [GIT](https://git-scm.com/), e clicar na opção "**Install for Windows**"

Com o arquivo baixado, seguir o processo de instalação executando o arquivo .exe instalado

  

## Como configurar sua credencial GIT no Windows

Para configurar sua credencial GIT no Windows basta clicar com o botão direito do mouse na área de trabalho e selecionar a opção "**Git Bash Here**". Essa opção, abrirá uma emulação de um terminal Linux, permitindo usar o GIT por linhas de comandos.

  

Abrindo o Git Bash, devemos primeiramente cadastrar nosso nome de usuário e email. Para isso, usaremos as linhas de código abaixo:

  

**Para cadastrar o nome:**

  

git config --global user.name '*Nome Completo*'

**Para cadastrar o email:**

git config --global user.email *Seu Email*

  

Após cadastrar suas credenciais, está na hora de clonar seu repertório para sua máquina, para assim, começar a codar

  
  

## Como clonar o repositório para sua máquina

  

Para clonar o repositório para nossa nossa máquina, iremos continuar usando o Git Bash.

  

Primeiro, abra seu repositório no **GitHub**; expanda a opção **<>CODE** e copie o link do caminho **HTTPS** (existem outros meios utilizando outros caminhos para clonar clonar um repositório, como por exemplo, a porta SSH, porém, para fins de estudos, utilizaremos o HTTPS).

Após copiar o link, voltamos ao Git Bash e utilizaremos o seguintes código:

  

**Para clonar repositótio:**

  

git clone *link copiado*

  

Para colar o link no terminal, use o atalho **Shift** + **Insert**

  
  

## JAVA (O temido)

  

O Java é uma das linguagens de programação mais utilizadas no mundo, e para utiliza-lá, é necessário instalar o **JDK** ( Java Development Kit ); o seu kit de desenvolvimento para conseguimos programar com a linguagem, pois esse JDK contém ferramentas essenciais como o **Compilador**, as **bibliotecas** e o **JRE**(Java Runtime Environment) para executar o código. Tudo isso é extremamente necessário para permitir nosso código rodar na **JVM** (Java Virtual Machine)

  

## Como configurar o JAVA

  

Para configurar o JAVA, primeiro devemos instalar seu JDK, no link a seguir estará uma versão muito recomendada que, também, será a versão utilizada

[TEMURIN JDK

](https://adoptium.net/pt-BR/temurin/releases)

  

Após clicar no link, escolha a versão "**JDK 25 - LTS**", a versão mais recente do JDK, e também, a versão que iremos utilizar. Selecione o sistema operacional que você utiliza (no caso utilizarei o Windows) e faça o download do .exe

  

Agora, execute o arquivo .exe e siga os passos descritos com atenção

  

1. Aperte **Next**

2. Aceite o termo e aperte **Next**

3. Selecione a opção **Install for all users of this machine** e depois aperte **Next**

4.  **ETAPA EXTREMAMENTE IMPORTANTE**; Irá aparecer 4 checklist, duas previamente marcadas, e as duas últimas, estão marcadas com um **X**, clique neles e selecione a primeira opção em ambas checklist marcadas com "X", Após isso aperte **Next**

5. Aperte **Install**

6. Aperte **Finish**




## Spring Boot

O Spring Boot é uma extensão de código aberto que utiliza a linguagem JAVA, construída sobre o Spring Framework. Ele serve para configurar automaticamente bibliotecas e componentes com base nas dependências que você adiciona ao projeto.

## Como configurar o Spring Boot?

 ### 1.  Spring Initializr
- Abrir o [site](https://start.spring.io/) (clique na palavra site para abrir)
-   Selecionar as opções: Maven em **Project** (para criar um projeto com o gerenciamento Maven); Java em **Language** (para escolher a linguagem JAVA); em **Spring Boot** selecione a versão mais recente que não tenha nenhuma ressalva entre parênteses.
- Na parte **Project Metadata**, mude o nome da opção "Artifacts" para um nome de sua escolha, e na opção **JAVA** selecione a versão do Java de sua preferência (as outras opções não são necessárias mudar por agora)
-   Em **Dependencies**, adicionar as dependências: Spring Web, Spring Boot Dev Tools e Lombok
-   Agora clique em **Generate** para gerar o arquivo .zip

### 2. Intellij

 - Ao abrir a IDE, clique em "New Project"
 - Agora, no lado esquerdo selecionar a opção **Spring Boot** (Está em Generators)
 - Após selecionar, configurar o Spring Boot da mesma maneira configurada antes; selecionando a linguagem, o tipo, escolhendo o nome, o JDK e a versão do JAVA, depois clicar em NEXT
 - Feito isso, você entrará na página para escolher as Dependencias; selecione as mesmas escolhidas antes, Spring Web, Spring Boot Dev Tools e Lombok. E clicar em CREATE.
