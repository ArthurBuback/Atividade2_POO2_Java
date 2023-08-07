package modelo;

public class Seguro {
    private float valor;
    private boolean vigencia;
    // Esta é uma das relações com Cliente:
    private Cliente proprietario;
    // O nome desta classe abaixo deve ser o nome do arquivo (não é obrigatório porém é uma boa prática) que ela faz referencia, sendo uma maneira alternativade de referenciar, baseado na anterior.
    private Cliente[] assegurados;

    public Seguro(float valor, boolean vigencia, Cliente proprietario) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
    }

    public Cliente[] getAssegurados() {
        return assegurados;
    }

    public void setAssegurados(Cliente[] assegurados) {
        this.assegurados = assegurados;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }
    
    
}
