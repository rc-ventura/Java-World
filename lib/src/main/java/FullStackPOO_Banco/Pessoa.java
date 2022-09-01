
package FullStackPOO_Banco;
public abstract class Pessoa implements ElementosDoBanco {

    // atributos 
    protected String nome;

    // construtores
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

// metodos padroes 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
