# Desafio Bootcamp POO Java 

Este projeto consiste na implementação de um sistema básico de gerenciamento de bootcamps em Java. Ele permite que desenvolvedores se inscrevam em bootcamps, concluam cursos e mentorias, e acompanhem o progresso, incluindo a quantidade de XP (Experiência) acumulada.

## Estrutura do Projeto

O projeto foi desenvolvido utilizando os seguintes componentes principais:

- **Classe `Conteudo`**: Uma classe abstrata que define o contrato para qualquer conteúdo oferecido em um bootcamp (como cursos ou mentorias). Inclui o cálculo do XP padrão.

- **Classe `Curso`**: Herda de `Conteudo` e adiciona a especificação da carga horária, além de redefinir o cálculo de XP baseado na carga horária.

- **Classe `Mentoria`**: Herda de `Conteudo` e inclui a data da mentoria. O cálculo de XP é fixo, somando um valor adicional ao XP padrão.

- **Classe `Bootcamp`**: Contém a lógica para armazenar e gerenciar os cursos, mentorias e desenvolvedores inscritos. Cada bootcamp tem uma data inicial e final.

- **Classe `Dev`**: Representa o desenvolvedor que participa do bootcamp. A classe permite que o desenvolvedor se inscreva em bootcamps, progrida nos conteúdos, e calcule o total de XP acumulado.

- **Classe `Main`**: Contém o método `main`, que instancia e utiliza as outras classes para demonstrar o funcionamento do sistema.

## Funcionalidades

- Inscrição de desenvolvedores em bootcamps.
- Progressão do desenvolvedor ao completar cursos e mentorias.
- Cálculo do total de XP adquirido por cada desenvolvedor.
- Exibição dos conteúdos inscritos e concluídos pelos desenvolvedores.

## Exemplo de Uso

No método `main`, criamos um bootcamp com dois cursos e uma mentoria. Dois desenvolvedores, "Camila" e "João", se inscrevem no bootcamp, progridem pelos conteúdos e têm seu progresso exibido no console, incluindo o cálculo do XP.

```java
public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JS");
    curso2.setDescricao("descrição curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    devCamila.progredir();

    Dev devJoao = new Dev();
    devJoao.setNome("João");
    devJoao.inscreverBootcamp(bootcamp);
    devJoao.progredir();
}
