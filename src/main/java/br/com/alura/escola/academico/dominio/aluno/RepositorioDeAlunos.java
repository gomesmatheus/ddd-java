package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.List;

// A camada de domínio se comunica com as camadas externas
// a partir de interfaces, de modo que caso algum
// componente de infraestrutura mude, não resulte
// em mudanças na camada de domínio
public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);
    Aluno buscarPorCpf(CPF cpf);
    List<Aluno> listarTodosAlunosMatriculado();
    //...

}
