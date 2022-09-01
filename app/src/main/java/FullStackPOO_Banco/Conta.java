
package FullStackPOO_Banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Ve
 */
public class Conta implements ElementosDoBanco {

    // atributos 
    protected int numero;
    protected String dataAbertura;
    protected boolean status;     // true - ativa ; false - inativa
    protected String senha;
    protected float saldo;
    protected Pessoa titular;
    protected List<Movimento> movimentos;

    // construtores
    public Conta() {
    }

    public Conta(int numero, String dataAbertura, boolean status, String senha, float saldo, Pessoa titular) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.status = true;
        this.senha = senha;
        this.saldo = saldo;
        this.titular = titular;
        this.movimentos = new ArrayList<>();

    }

    // metodos padroes 
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    // funcoes e metodos
    public void saque(float valor) {
        this.saldo = this.saldo - valor;
        movimentos.add(new Movimento("Saque", valor));

    }

    public void atualizaTaxa() {
        this.saldo = this.saldo - 20f;
        movimentos.add(new Movimento("Taxa", 20));
    }

    public void deposito(float valor) {
        this.saldo = this.saldo + valor;
        movimentos.add(new Movimento("Deposito", valor));
    }

    public void relatorio() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.numero);
        System.out.println("Tipo: Conta Comum");
        System.out.println("Abertura: " + this.dataAbertura);
        System.out.println("Status: " + (this.status) != null ? "Status: Ativa" : "Inativa");  // entender este comando
        System.out.println("Titular: " + this.titular);
        System.out.println("Movimentos: ");
        for (Movimento m : movimentos) {
            System.out.println((movimentos.indexOf(m) + 1) + "         "
                    + m.getTipoMovimento() + "       " + m.getValor());
        }
        System.out.println("Saldo: " + this.saldo);
        System.out.println("----------------------------");
        System.out.println("----------------------------");

    }

    public String getElementoInfo() {
        return "Conta{" + "numero=" + numero + ", dataAbertura=" + dataAbertura + ", status=" + status + ", senha=" + senha + ", saldo=" + saldo + ", titular=" + titular + '}';
    }

}
