
package FullStackPOO_Banco;
/**
 *
 * @author RC_Ventura
 */
public class PessoaJuridica extends Pessoa {

    //atributos
    private String cnpj;
    private String cidade;
    private String estado;

    // construtores
    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String cidade, String estado, String nome) {
        super(nome);
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.estado = estado;
    }

    // metodos padroes 
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", cidade=" + cidade + ", estado=" + estado + '}';
    }

    // funcoes
    @Override
    public String getElementoInfo() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", cidade=" + cidade + ", estado=" + estado + '}';
    }

}
