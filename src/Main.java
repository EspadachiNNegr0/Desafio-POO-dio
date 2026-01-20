import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando Cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Dominando React Professional");
        curso1.setDescricao("Aprenda hooks, context API e performance no Front-end");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Node.js de alto nível");
        curso2.setDescricao("Arquitetura de microsserviços e bancos de dados NoSQL");
        curso2.setCargaHoraria(10);

        // Criando Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Carreira Internacional na Tecnologia");
        mentoria.setDescricao("Dicas sobre LinkedIn, currículo em inglês e processos seletivos");
        mentoria.setData(LocalDate.now());

        // Configurando o Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Fullstack Ninja");
        bootcamp.setDescricao("Torne-se um desenvolvedor completo do zero ao deploy");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Exemplo com a Dev "Ana"
        Dev devAna = new Dev();
        devAna.setNome("Ana Paula");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Ana:" + devAna.getConteudosInscritos());

        devAna.progredir(); // Concluiu o primeiro curso

        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP Acumulado:" + devAna.calcularTotalXp());

        System.out.println("------------------------------------");

        // Exemplo com o Dev "Carlos"
        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos Silva");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Carlos:" + devCarlos.getConteudosInscritos());

        // Carlos concluiu tudo!
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Carlos:" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Carlos:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP Acumulado:" + devCarlos.calcularTotalXp());
    }
}
