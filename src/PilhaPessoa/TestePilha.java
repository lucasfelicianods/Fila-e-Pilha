package PilhaPessoa;


import javax.swing.JOptionPane;


public class TestePilha {
    public static void main(String[] args) {
        String menu = String.format(""
                + "1 - Empilhar  Pessoa\n"
                + "2 - Desempilhar Pessoa\n"
                + "3 - Imprimir toda a pilha\n"
                + "4 - Consultar/mostrar o objeto Pessoa do topo da pilha\n"
                + "5 - Sair"
        );
        
        Pilha p1 = new Pilha();
        try {
        	 int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

             while (opcao != 5) {
                 switch (opcao) {
                     case 1:
                         
                         p1.empilhar(
                                 new Pessoa(
                                         JOptionPane.showInputDialog("Nome: "),
                                         Integer.parseInt(JOptionPane.showInputDialog("Fone: ")),
                                         JOptionPane.showInputDialog("Endere�o: ")
                                 ));
                         break;

                     case 2:
                         if (p1.vazia()) {
                             JOptionPane.showMessageDialog(null, "A pilha est� vazia!");
                         } else {
                             JOptionPane.showMessageDialog(null, p1.desempilhar());
                         }
                         break;
                     case 3:
                         if (p1.vazia()) {
                             JOptionPane.showMessageDialog(null, "A Pilha est� vazia!");
                         } else {
                             p1.imprimirPilha();
                         }
                         break;

                     case 4:
                         if (p1.vazia()) {
                             JOptionPane.showMessageDialog(null, "A Pilha est� vazia!");
                         } else {
                        	 JOptionPane.showMessageDialog(null, "O elemento do Topo e : "+ p1.topoDaPilha());
                         }
                         break;

                     
                 }
                 opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
             }
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Processo cancelado!!");
		}
        
       
    }
}
