package br.com.dio.desafio;
import br.com.dio.desafio.model.Bootcamp;
import br.com.dio.desafio.model.Curso;
import br.com.dio.desafio.model.Dev;
import br.com.dio.desafio.model.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Curso introdutório Java");
        cursoJava.setCargaHoraria(90);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Curso de Spring");
        cursoSpring.setDescricao("Curso introdutório Spring");
        cursoSpring.setCargaHoraria(90);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Stream API Java");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Spring Framework");
        bootcamp.setDescricao("Aprenda Spring com Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);

        devBruno.progredir();
        System.out.println(devBruno.calcularTotalXp());

        devBruno.progredir();
        System.out.println(devBruno.calcularTotalXp());

        devBruno.progredir();
        System.out.println(devBruno.calcularTotalXp());
    }

}
