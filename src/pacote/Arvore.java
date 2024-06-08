package pacote;

public class Arvore {
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }

    public void adicionaElemento(int e, String nomeUsuario) {
        Usuario novoUsuario = new Usuario(nomeUsuario, e);
        No novo = new No(e, novoUsuario);
        if (raiz == null) {
            raiz = novo;
        } else {
            No atual = raiz;
            No pai;
            while (true) {
                pai = atual;
                if (e <= atual.getElemento()) {
                    atual = atual.getEsquerda();
                    if (atual == null) {
                        pai.setEsquerda(novo);
                        return;
                    }
                } else {
                    atual = atual.getDireita();
                    if (atual == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.getElemento() + " ");
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getEsquerda());
            System.out.print(no.getElemento() + " ");
            emOrdem(no.getDireita());
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.print(no.getElemento() + " ");
        }
    }

    public Usuario buscaUsuario(int e) {
        No atual = raiz;
        while (atual != null) {
            if (e == atual.getElemento()) {
                return atual.getUsuario();
            } else if (e < atual.getElemento()) {
                atual = atual.getEsquerda();
            } else {
                atual = atual.getDireita();
            }
        }
        return null;
    }

    public void removeElemento(int e) {
        raiz = removeNo(raiz, e);
    }

    private No removeNo(No no, int e) {
        if (no == null) {
            return null;
        }
        if (e < no.getElemento()) {
            no.setEsquerda(removeNo(no.getEsquerda(), e));
        } else if (e > no.getElemento()) {
            no.setDireita(removeNo(no.getDireita(), e));
        } else {
            if (no.getEsquerda() == null) {
                return no.getDireita();
            } else if (no.getDireita() == null) {
                return no.getEsquerda();
            }
            no.setElemento(menorValor(no.getDireita()));
            no.setDireita(removeNo(no.getDireita(), no.getElemento()));
        }
        return no;
    }

    private int menorValor(No no) {
        int menorValor = no.getElemento();
        while (no.getEsquerda() != null) {
            menorValor = no.getEsquerda().getElemento();
            no = no.getEsquerda();
        }
        return menorValor;
    }
}