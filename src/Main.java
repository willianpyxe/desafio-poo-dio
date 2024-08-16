import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
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


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria*/);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devcamila = new Dev();
        devcamila.setNome("Camila");
        devcamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devcamila.getConteudosInscritos());

        System.out.println("-");
        devcamila.progredir();
        System.out.println("Conteúdos Inscritos" + devcamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devcamila.getConteudosConcluidos());
        System.out.println("XP: " + devcamila.calcularTotalXP());

        System.out.println("----------");

        Dev devjao = new Dev();
        devjao.setNome("João");
        devjao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devjao.getConteudosInscritos());
        System.out.println("-");
        devjao.progredir();

        System.out.println("Conteúdos Inscritos" + devjao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devjao.getConteudosConcluidos());
        System.out.println("XP: " + devjao.calcularTotalXP());


    }
}
