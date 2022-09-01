
package FullStackPOO_Banco;
/**
 *
 * @author RC_Ventura
 */
public class Movimento {

// //atributos 
    private String tipoMovimento;  // posso fazer um Enum
    private float valor;

    // construtores
    public Movimento() {
    }

    public Movimento(String tipoMovimento, float valor) {
        this.tipoMovimento = tipoMovimento;
        this.valor = valor;

    }

    // funcoes padroes
    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
