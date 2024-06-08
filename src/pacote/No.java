
package pacote;

/**
 *
 * @author clima
 */
public class No {
    private int elemento;
    private Usuario usuario;
    private No esquerda, direita;

    public No(int e, Usuario usuario) {
        this.elemento = e;
        this.usuario = usuario;
        this.esquerda = null;
        this.direita = null;
    }

    // Getters e setters
    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
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
