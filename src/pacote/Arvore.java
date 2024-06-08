package pacote;

public class Arvore {
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }

    public boolean insereLogin(String senha, String nomeUsuario) {
        Usuario novoUsuario = new Usuario(nomeUsuario, senha);
        No novo = new No(senha, novoUsuario);

        if (raiz == null) {
            raiz = novo;
            return true;
        } else {
            No atual = raiz;
            No pai;
            boolean senhaExistente = false;

            while (true) {
                pai = atual;
                if (senha.compareTo(atual.getSenha()) == 0) {
                    senhaExistente = true;
                    break;
                } else if (senha.compareTo(atual.getSenha()) <= 0) {
                    atual = atual.getEsquerda();
                    if (atual == null) {
                        pai.setEsquerda(novo);
                        return true;
                    }
                } else {
                    atual = atual.getDireita();
                    if (atual == null) {
                        pai.setDireita(novo);
                        return true;
                    }
                }
            }

            return !senhaExistente;
        }
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.getSenha() + " ");
            preOrdem(no.getEsquerda());
            preOrdem(no.getDireita());
        }
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getEsquerda());
            System.out.print(no.getSenha() + " ");
            emOrdem(no.getDireita());
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getEsquerda());
            posOrdem(no.getDireita());
            System.out.print(no.getSenha() + " ");
        }
    }

    public Usuario validaLogin(String senha) {
        No atual = raiz;
        while (atual != null) {
            if (senha.equals(atual.getSenha())) {
                return atual.getUsuario();
            } else if (senha.compareTo(atual.getSenha()) < 0) {
                atual = atual.getEsquerda();
            } else {
                atual = atual.getDireita();
            }
        }
        return null;
    }

     public boolean removeLogin(String senha) {
        No noRemovido = removeNo(raiz, senha);
        return noRemovido != null;
    }

    private No removeNo(No no, String senha) {
        if (no == null) {
            return null;
        }

        if (senha.compareTo(no.getSenha()) < 0) {
            no.setEsquerda(removeNo(no.getEsquerda(), senha));
        } else if (senha.compareTo(no.getSenha()) > 0) {
            no.setDireita(removeNo(no.getDireita(), senha));
        } else {
            if (no.getEsquerda() == null) {
                return no.getDireita();
            } else if (no.getDireita() == null) {
                return no.getEsquerda();
            }

            no.setSenha(menorValor(no.getDireita()));
            no.setDireita(removeNo(no.getDireita(), no.getSenha()));
        }

        return no;
    }

    private String menorValor(No no) {
        String menorValor = no.getSenha();
        while (no.getEsquerda() != null) {
            menorValor = no.getEsquerda().getSenha();
            no = no.getEsquerda();
        }
        return menorValor;
    }
}

//Caio Gabriel Fuente de Lima - 1141966436
//Lucas Pires Ferraz ? 1141961865 - 1141961865
//Marcela Souza Ribeiro de Andrade - 1142864530
//Victória Wellem Freitas Cunha - 1142707148
//Pedro Augusto - 1142539572