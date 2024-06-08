package pacote;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Arvore ab = new Arvore();
        String menu = "Menu de Opções criando arvore binaria\n1 - Adicionar Elemento\n2 - Ver elementos pre ordem\n3 - Ver elementos pos ordem\n4 - Ver elementos em ordem\n5 - Buscar elemento\n6 - Remover elemento\n99 - Sair";
        int op = 0, num;
        String nomeUsuario;

        while (op != 99) {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero: "));
                    nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuário: ");
                    ab.adicionaElemento(num, nomeUsuario);
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
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser buscado: "));
                    Usuario usuario = ab.buscaUsuario(num);
                    if (usuario != null) {
                        JOptionPane.showMessageDialog(null, "O elemento " + num + " existe na árvore e está associado ao usuário: " + usuario.getNome());
                    } else {
                        JOptionPane.showMessageDialog(null, "O elemento " + num + " não existe na árvore!");
                    }
                    break;
                case 6:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser removido: "));
                    ab.removeElemento(num);
                    break;
            }
        }
    }
}