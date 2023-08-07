package modelo;

public class Cliente {
    /**
     * String é maiúsculo pois faz menção ao objeto String.
     * String é um objeto primitivo, ou seja é algo que existe no padrão do Java(?).
     * E como muitas pessoas utilizam muito, fizeram a própria "classe" String.
     */
    private String nome;
    private String cpf;

    // Não é necessário escrever essa proxima parte, pode-se apenas clicar como botão direito e em "Insert Code".
    // Este é o "Constructor"
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //
    
    // Esses são os "Getters and Setters"
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //
    
}
