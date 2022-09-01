
package FullStackPOO_Banco;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author RC_Ventura
 */
public class Banco {

    public static void main(String[] args) {
        // pessoas
        List<Pessoa> pessoas = new LinkedList<Pessoa>();
        // pessoa fisica = {cpf, nome, data nasc., RG, renda}
        pessoas.add(new PessoaFisica("111.111.111-11", "Joao Paulo", "01/01/1980", "1.111.111 SSP/SC", 1000f));
        pessoas.add(new PessoaFisica("222.222.222-22", "Maria Antonia", "30/03/1968", "2.222.222 SSP/PR", 3200f));

        // pessoa juridica = {cnpj, nome, cidade, estado}
        pessoas.add(new PessoaJuridica("11.111.111/1111-11", "XZ Serviços TI", "Blumenau", "SC"));
        pessoas.add(new PessoaJuridica("33.333.333/3333-33", "Estofados 3 Irmãos", "Rio de Janeiro", "RJ"));

        // contas
        List<Conta> contas = new LinkedList<>();
        // conta comum = {numero, data abertura, status, senha, saldo, titular da conta
        contas.add(new Conta(1, "10/10/1998", true, "123mudar", 1000f, pessoas.get(0)));
        contas.add(new Conta(2, "01/07/2012", true, "456mudar", 2200f, pessoas.get(0)));

        // conta especial = {numero, data abertura, status, senha, saldo, limite, dono da conta
        contas.add(new ContaEspecial(3, "05/03/2004", true, "789mudar", 10000f, 3000f, pessoas.get(1)));
        contas.add(new ContaEspecial(4, "15/10/2013", true, "999mudar", 20000, 5000f, pessoas.get(3)));

        // conta poupanca = {numero, data abertura, status, senha, saldo, dia aniversario, dono da conta
        contas.add(new ContaPoupanca(5, "05/05/2020", true, "789mudar", 10000f, 10, pessoas.get(1)));
        contas.add(new ContaPoupanca(6, "05/05/2020", true, "789mudar", 2000f, 23, pessoas.get(2)));

        // movimentacoes em todas as contas;
        for (Conta c : contas) {
            c.deposito(1000f);
            c.deposito(200f);

            c.saque(500f);
            c.saque(300f);
            c.atualizaTaxa();
        }

        // apresenta relatorio com dados das contas, titulares, movimentaçoes e saldo
        System.out.println("\n\n---- Relatorio ----------------------");
        for (Conta c : contas) {
            c.relatorio();
        }

        System.out.println("\n\n---- Testando a conta especial - saldo negativo ------------");
        Conta contaesp = contas.get(2);
        contaesp.saque(10000f);
        contaesp.saque(1000f);
        contaesp.relatorio();

        // ordena as contas por saldo do maior para o menor
        contas.sort(new ComparadorSaldoDec());
        // apresenta relatorio com dados das contas, titulares, movimentaçoes e saldo
        System.out.println("\n\n---- Relatorio ordenado pelo Saldo Dec ---------"
                + "-------------");
        for (Conta c : contas) {
            c.relatorio();
        }

        System.out.println("\n\n---- Criando lista única com todas as contas e clientes---");
        List<ElementosDoBanco> elementos = new LinkedList<>();
        elementos.addAll(pessoas);
        elementos.addAll(contas);

        for (ElementosDoBanco e : elementos) {
            System.out.println(e.getElementoInfo());
        }

    }

}
