package pacote;

public class Arvore {
    private No raiz;

    public Arvore() {
        raiz = null;
    }

    /*
     * public String emOrdem(No n) { //ORDENA A ARVORE if (n != null) { return
     * emOrdem(n.esquerda) + " " + n.elemento + " " + emOrdem(n.direita); } return
     * ""; }
     */

    public boolean existeElemento(int e) {
        No aux1 = raiz, aux2 = raiz;
        while (aux1 != null && e != aux2.elemento) {
            aux2 = aux1;
            if (e < aux1.elemento) {
                aux1 = aux1.esquerda;
            } else if (e > aux1.elemento) {
                aux1 = aux1.direita;
            }
        }
        return e == aux2.elemento;
    }

    public void adicionaElemento(int e) {
        No novo = new No(e);
        if (raiz == null) {
            raiz = novo;
        } else {
            No aux1 = raiz, aux2 = raiz;
            while (aux1 != null && !existeElemento(e)) {
                aux2 = aux1;
                if (e < aux1.elemento) {
                    aux1 = aux1.esquerda;
                } else if (e > aux1.elemento) {
                    aux1 = aux1.direita;
                }
            }
            if (existeElemento(e)) {
                System.out.println("Elemento já existe");
            } else {
                if (e < aux2.elemento) {
                    aux2.esquerda = novo;
                } else if (e > aux2.elemento) {
                    aux2.direita = novo;
                }
                System.out.println("Elemento Incluído");
            }
        }
    }
    public void removeElemento(int e) {
    No aux1 = raiz, aux2 = null;
    while (aux1 != null && aux1.elemento != e) {
        aux2 = aux1;
        if (e < aux1.elemento) {
            aux1 = aux1.esquerda;
        } else {
            aux1 = aux1.direita;
        }
    }
    if (aux1 == null) {
        System.out.println("Elemento não encontrado");
    } else if (aux1.esquerda == null && aux1.direita == null) {
        if (aux2 == null) {
            raiz = null;
        } else if (aux2.esquerda == aux1) {
            aux2.esquerda = null;
        } else {
            aux2.direita = null;
        }
        System.out.println("Elemento " + e + " removido com sucesso!");
    } else if (aux1.esquerda == null) {
        if (aux2 == null) {
            raiz = aux1.direita;
        } else if (aux2.esquerda == aux1) {
            aux2.esquerda = aux1.direita;
        } else {
            aux2.direita = aux1.direita;
        }
        System.out.println("Elemento " + e + " removido com sucesso!");
    } else if (aux1.direita == null) {
        if (aux2 == null) {
            raiz = aux1.esquerda;
        } else if (aux2.esquerda == aux1) {
            aux2.esquerda = aux1.esquerda;
        } else {
            aux2.direita = aux1.esquerda;
        }
        System.out.println("Elemento " + e + " removido com sucesso!");
    } else {
        No aux3 = aux1.direita;
        aux2 = aux1;
        while (aux3.esquerda != null) {
            aux2 = aux3;
            aux3 = aux3.esquerda;
        }
        aux1.elemento = aux3.elemento;
        if (aux2 == aux1) {
            aux2.direita = aux3.direita;
        } else {
            aux2.esquerda = aux3.direita;
        }
        System.out.println("Elemento " + e + " removido com sucesso!");
    }
}

    public void verifica(int e) {
        No aux = raiz;
        while (aux != null) {
            if (e < aux.elemento) {
                aux = aux.esquerda;
            } else if (e > aux.elemento) {
                aux = aux.direita;
            } else {
                System.out.println("Elemento Repetido");
            }
        }
    }

    public void preOrdem(No n) {
        if (n != null) {
            System.out.println("Elemento " + n.elemento);
            preOrdem(n.esquerda);
            preOrdem(n.direita);
        }
    }

    public void emOrdem(No n) {
        if (n != null) {
            emOrdem(n.direita);
            System.out.println("Elemento " + n.elemento);
            emOrdem(n.esquerda);
        }
    }

    public void posOrdem(No n) {
        if (n != null) {
            posOrdem(n.esquerda);
            posOrdem(n.direita);
            System.out.println("Elemento " + n.elemento);
        }
    }

    public No getRaiz() {
        return raiz;
    }
}
