package modulo02.heranca_e_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario{
    List<Professor> professoresOrientados = new ArrayList<>();

    public void orientarProfessor(){};
    public void exibirProfessoresOrientados(){};

}
