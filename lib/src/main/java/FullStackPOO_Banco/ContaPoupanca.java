
package FullStackPOO_Banco;
/**
 *
 * @author RC_Ventura
 */
public class ContaPoupanca extends Conta {

    // atributos
    private int diaAniversario;
    private float juros;

    // construtores
    public ContaPoupanca() {
    }

    public ContaPoupanca(int numero, String dataAbertura, boolean status, String senha, float saldo, int diaAniversario, Pessoa titular) {
        super(numero, dataAbertura, status, senha, saldo, titular);
        this.diaAniversario = diaAniversario;

        // metodos padroes 
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;

    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    // funcoes e metodos 
    public void atualizaTaxa() {
        this.juros = (this.saldo * 1.005f) - this.saldo;
        movimentos.add(new Movimento("Juros", juros));
    }

    @Override
    public void relatorio() {
        System.out.println("Conta: " + this.numero);
        System.out.println("Tipo: Conta Poupanca");
        System.out.println("Dia Aniversario: " + this.diaAniversario);
        System.out.println("Abertura: " + this.dataAbertura);
        System.out.println("Status: " + (this.status) != null ? "Status: Ativa" : "Inativa");  // entender este comando
        System.out.println("Titular: " + this.titular);
        System.out.println("Movimentos: ");
        for (Movimento m : movimentos) {
            System.out.println((movimentos.indexOf(m) + 1) + "         "
                    + m.getTipoMovimento() + "      " + m.getValor());
        }
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Rendimentos: " + this.juros);
        System.out.println("----------------------------");
        System.out.println("----------------------------");

    }

    public String getElementoInfo() {
        return "ContaPoupanca{" + " diaAniversario" + diaAniversario + ", numero=" + numero + ", dataAbertura=" + dataAbertura
                + ", status=" + status + ", senha=" + senha + ", saldo=" + saldo
                + ", titular=" + titular + '}';

    }
}
