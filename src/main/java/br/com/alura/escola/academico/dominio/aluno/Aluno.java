package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;

// Considerada uma classe entidade por ter um atributo identificador
public class Aluno {

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    // id não é um conceito do domínio da aplição, e sim de banco de dados
    // de infraestrutura, a ideia é que o domínio esteja isolado
    // usar o ID nesse cenário, acoplaria o domínio à infraestrutura
    // por ser algo relacionado diretamente com o banco de dados
    // o que não é recomendado pelas práticas de clean architecture
    // private Long id;

    // Utilizar o CPF como identificador faria muito mais sentido por conta disso
    private CPF cpf; // Por ter um identificador, essa classe é considerada uma entidade
    private String nome;
    // private String email; // Possui regras de validação, portanto é mais correto ser criada como uma classe
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public void adicionarTelefone(String ddd, String numero) {
        if (telefones.size() == 2) {
            throw new IllegalArgumentException("Número máximo de telefones já atingido!"); // Poderia ser uma exception custom
        }
        this.telefones.add(new Telefone(ddd, numero));
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
