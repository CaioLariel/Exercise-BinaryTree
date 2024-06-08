package pacote;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Arvore ab = new Arvore();
        String menu = "Menu de Opções criando arvore binaria\n1 - Adicionar um cadastro\n2 - Ver senhas pre ordem\n3 - Ver senhas pos ordem\n4 - Ver senhas em ordem\n5 - Buscar cadastro por senha\n6 - Remover cadastro por senha\n99 - Sair";
        int op = 0;
        String senha, nomeUsuario;

        while (op != 99) {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    senha = JOptionPane.showInputDialog("Digite uma Senha: ");
                    nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuário: ");
                    ab.adicionaSenha(senha, nomeUsuario);
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
                    senha = JOptionPane.showInputDialog("Digite a senha a ser buscada: ");
                    Usuario usuario = ab.buscaUsuario(senha);
                    if (usuario != null) {
                        JOptionPane.showMessageDialog(null, "A senha " + senha + " existe na árvore e está associada ao usuário: " + usuario.getNome());
                    } else {
                        JOptionPane.showMessageDialog(null, "A senha " + senha + " não existe na árvore!");
                    }
                    break;
                case 6:
                    senha = JOptionPane.showInputDialog("Digite a senha a ser removida: ");
                    ab.removeSenha(senha);
                    break;
            }
        }
    }
}