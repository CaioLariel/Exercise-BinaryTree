package pacote;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Arvore ab = new Arvore();
        String menu = "Menu de Op��es criando arvore binaria\n1 - Adicionar Elemento\n2 - Ver elementos pre ordem\n3 - Ver elementos pos ordem\n4 - Ver elementos em ordem\n5 - Buscar elemento\n6 - Remover elemento\n99 - Sair";
        int op = 0, num;
        while (op != 99) {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero: "));
                    ab.adicionaElemento(num);
                    break;
                case 2:
                    System.out.println("Pre Ordem");
                    ab.preOrdem(ab.getRaiz());
                    break;
                case 3:
                    System.out.println("Pos Ordem");
                    ab.posOrdem(ab.getRaiz());
                    break;
                case 4:
                    System.out.println("Em Ordem");
                    ab.emOrdem(ab.getRaiz());
                    break;
                case 5:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero a ser buscado: "));
                    if (ab.existeElemento(num)) {
                        JOptionPane.showMessageDialog(null, "O elemento " + num + " existe na �rvore!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O elemento " + num + " n�o existe na �rvore!");
                    }
                    break;
                case 6:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero a ser removido: "));
                    ab.removeElemento(num);
                    break;
            }
        }
    }
}
