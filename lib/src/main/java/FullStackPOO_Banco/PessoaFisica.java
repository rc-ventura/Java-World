
package FullStackPOO_Banco;
/**
 *
 * @author RC_Ventura
 */
public class PessoaFisica extends Pessoa {

    //atributos     
    private String cpf;
    private String dataNascimento;
    private String rg;
    private float renda;

    // construtores
    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String nome, String dataNascimento, String rg, float renda) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.renda = renda;
    }

    // metodos padroes
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", renda=" + renda + '}';
    }

    // funcoes e metodos
    @Override
    public String getElementoInfo() {

        return "PessoaFisica{" + "cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", renda=" + renda + '}';
    }

}
