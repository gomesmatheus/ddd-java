package br.com.alura.escola.academico.dominio.aluno;

// Não é uma entidade, pois não precisa ser identificada como única
// E sim, segue um padrão conhecido como "Value object", pois se dois emails iguais forem passados
// podem ser considerados iguais
public class Email {

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email inválido!"); // Poderia ser uma exception customizada
        }
        this.endereco = endereco;
    }

    private String endereco;

    public String getEndereco() {
        return endereco;
    }

}
