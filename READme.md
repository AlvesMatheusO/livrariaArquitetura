<h1>Sistema CRUD Biblioteca</h1> 

<p align="center">

<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.techtudo.com.br%2Fnoticias%2F2014%2F11%2Fjava-entenda-para-que-serve-o-software-e-os-problemas-da-sua-ausencia.ghtml&psig=AOvVaw0A9kzIBj0XHzgu3R3qSlmk&ust=1697050498605000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPC_svGT7IEDFQAAAAAdAAAAABAE"/>
  
  <img src="http://img.shields.io/static/v1?label=TESTES&message=%3E100&color=GREEN&style=for-the-badge"/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=RED&style=for-the-badge"/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
</p>

> Status do Projeto: :heavy_check_mark: :warning: (concluido, em desenvolvimento, etc)

### Tópicos 

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Funcionalidades](#funcionalidades)

:small_blue_diamond: [Demonstração](#deploy-da-aplicação-dash)

:small_blue_diamond: [Pré-requisitos](#pré-requisitos)



## Descrição do projeto 

<p align="justify">
  O Sistema é um CRUD (CREATE, READ, UPDATE, DELETE) de uma biblioteca. Contendo Classes: Livro, Livro Digital, Funcionário e Cliente. O projeto foi desenvolvido utilizando Design Pattern, GRASP e GOF. 
</p>

## Funcionalidades

:heavy_check_mark: Livros
<p align="justify">
A classe Livros possui uma model, um Controller para organizar as funções do CRUD utilizando métodos de Polimorfismo e uma Factory para criação do livro. 
</p>

:heavy_check_mark: Livro Digital
<p align="justify">
É uma subclasse de Livro (Possui Herança), foi criado com o padrão Builder e utiliza do Polimorfismo da Classe Livro para a criação e manipulação do mesmo. 
</p>

:heavy_check_mark: Funcionários
<p align="justify">
Possui a Model de Funcionário e uma classe com o Padrão Singleton onde cria sua instância e é possivel a criação e manipulação do cadastro de funcionários.
</p>

:heavy_check_mark: Clientes
<p align="justify">
Possui a Model de Cliente e um controller com métodos de polimorfismo para manipulação do CRUD. 
</p>

:heavy_check_mark: Interface 
<p align="justify">
A interface está localizada da classe App.java, foi desenvolvida com a biblioteca nativa JAVA SWING (JOptionPane e JTextField) por sua facilidade na implementação e ajuda para realizar os testes.
</p>
<p align="justify">
Os resultados são impressos na aba de execução utilizando-se do System.out.printLn()
</p>



## Layout :dash:

![tela-inicial](image.png)
![tipo-livro](image-1.png)
![entrada](image-2.png)
![cliente](image-3.png)
![exclusaoCliente](image-4.png)
![Funcionario](image-5.png)

## Pré-requisitos
-Java instalado;

## Como rodar a aplicação :arrow_forward:

No terminal, clone o projeto: 

```
git clone https://github.com/AlvesMatheusO/livrariaArquitetura.git
```

ou

```
git@github.com:AlvesMatheusO/livrariaArquitetura.git
```

Para rodar o projeto vá até a Classe App.java e rode com sua IDE.

