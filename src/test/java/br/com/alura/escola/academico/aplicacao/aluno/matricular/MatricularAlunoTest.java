package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio, publicador);
        MatricularAlunoDTO matricularAlunoDTO = new MatricularAlunoDTO("Fulano", "123.456.789-00", "fulano@gmail.com");

        useCase.executa(matricularAlunoDTO);
        Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-00"));
        Assertions.assertEquals("Fulano", encontrado.getNome());
        Assertions.assertEquals("123.456.789-00", encontrado.getCpf());
        Assertions.assertEquals("fulano@gmail.com", encontrado.getEmail());
    }

}
