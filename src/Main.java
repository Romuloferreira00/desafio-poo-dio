import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("drescrição curso java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("drescrição curso js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devRomulo= new Dev();
        devRomulo.setNome("Romulo");
        devRomulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Romulo:" + devRomulo.getConteudosInscritos());
        devRomulo.progredir();
        System.out.println("*---    UPLOAD  --*");
        System.out.println("Conteúdos Inscritos Romulo:" + devRomulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Romulo:" + devRomulo.getConteudosConcluidos());
        System.out.println("XP : " + devRomulo.calcularXp());

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");

        Dev devCamila= new Dev();
        devRomulo.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        //devCamila.progredir();
        System.out.println("*---    UPLOAD  --*");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Romulo:" + devCamila.getConteudosConcluidos());
        System.out.println("XP : " + devCamila.calcularXp());
    }
}
