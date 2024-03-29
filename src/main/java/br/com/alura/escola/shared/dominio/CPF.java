package br.com.alura.escola.shared.dominio;

// Value Object
public class CPF {

    public CPF(String numero) {
        if(numero == null || !numero.matches("(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})|(\\d{11})$")) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.numero = numero;
    }

    private String numero;

    public String getNumero() {
        return numero;
    }

}
