package pacote;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Arvore ab = new Arvore();

        String menu = "Menu de Op��es criando arvore binaria\n1 - Adicionar um cadastro\n2 - Ver senhas pre ordem\n3 - Ver senhas pos ordem\n4 - Ver senhas em ordem\n5 - Buscar cadastro por senha\n6 - Remover cadastro por senha\n99 - Sair";
        int op = 0;
        String senha, nomeUsuario;

        while (op != 99) {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 1:
                    senha = JOptionPane.showInputDialog("Digite uma Senha: ");
                    nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usu�rio: ");
                    boolean inserido = ab.insereLogin(senha, nomeUsuario);
                    if (inserido) {
                        JOptionPane.showMessageDialog(null, "Senha '" + senha + "' inserida com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: N�o � poss�vel inserir a senha '" + senha + "' porque ela j� existe na �rvore.");
                    }
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
                    Usuario usuario = ab.validaLogin(senha);
                    if (usuario != null) {
                        JOptionPane.showMessageDialog(null, "A senha " + senha + " existe na �rvore e est� associada ao usu�rio: " + usuario.getNome());
                    } else {
                        JOptionPane.showMessageDialog(null, "A senha " + senha + " n�o existe na �rvore!");
                    }
                    break;
                case 6:
                    senha = JOptionPane.showInputDialog("Digite a senha a ser removida: ");
                    boolean removido = ab.removeLogin(senha);
                    if (removido) {
                        JOptionPane.showMessageDialog(null, "Senha '" + senha + "' removida com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: Senha '" + senha + "' n�o encontrada na �rvore.");
                    }
                    break;
            }
        }
    }
}

//Caio Gabriel Fuente de Lima - 1141966436
//Lucas Pires Ferraz ? 1141961865 - 1141961865
//Marcela Souza Ribeiro de Andrade - 1142864530
//Vict�ria Wellem Freitas Cunha - 1142707148
//Pedro Augusto - 1142539572