package br.com.alura.escola.academico.dominio.indicacao;

import br.com.alura.escola.academico.dominio.aluno.Aluno;

import java.time.LocalDateTime;

// Value Object
public class Indicacao {

    // O instrutor enfatiza que devemos nomear os atríbutos conforme os termos utilizados pela equipe de negócio
    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime data;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.data = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public LocalDateTime getData() {
        return data;
    }
}
