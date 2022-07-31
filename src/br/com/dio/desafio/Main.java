package br.com.dio.desafio;
import br.com.dio.desafio.model.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("titulo mentoria 1");
        mentoria1.setDescricao("descrição mentoria 1");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
}
