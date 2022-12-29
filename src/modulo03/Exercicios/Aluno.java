package modulo03.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    public String matricula;
    public List<Double> notas = new ArrayList<>();
    Aluno (String nome, String matricula){
        super(nome);
        this.matricula = matricula;
    }
    public void addNota (Double nota) {
        notas.add(nota);
    }
}