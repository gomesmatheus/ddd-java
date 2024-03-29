package br.com.alura.escola.academico;

import br.com.alura.escola.academico.dominio.aluno.Email;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(""));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailsComEnderecosValidos() {
        String endereco = "matheus@gmail.com";
        Email email = new Email(endereco);
        Assertions.assertEquals(endereco, email.getEndereco());
    }
}
