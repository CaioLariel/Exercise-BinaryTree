package pacote;

/**
 *
 * @author clima
 */
public class No {
    private String senha;
    private Usuario usuario;
    private No esquerda, direita;

    public No(String senha, Usuario usuario) {
        this.senha = senha;
        this.usuario = usuario;
        this.esquerda = null;
        this.direita = null;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}

//Caio Gabriel Fuente de Lima - 1141966436
//Lucas Pires Ferraz ? 1141961865 - 1141961865
//Marcela Souza Ribeiro de Andrade - 1142864530
//Vict�ria Wellem Freitas Cunha - 1142707148
//Pedro Augusto - 1142539572