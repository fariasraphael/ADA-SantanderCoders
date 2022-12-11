package modulo02.exercicio01;

public class Pessoa {
    private String nome;
    private String idade;
    private String altura;

    public Pessoa (String nome, String idade, String altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
    public String getNome () {
        return nome;
    }

    public void setNome () {
        this.nome = nome;
    }

    public String idade () {
        return idade;
    }

    public void setIdade () {
        this.idade = idade;
    }

    public String getAltura () {
        return altura;
    }

    public void setAltura () {
        this.altura = altura;
    }
}
