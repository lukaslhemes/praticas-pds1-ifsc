package visão;

import javax.swing.JOptionPane;

public class roberto  {

	
	public static void main(String[] args) {
	 
		
		
	  	String digitado = JOptionPane.showInputDialog("Digite a senha do banco");
	  	
	  	if(!digitado.isEmpty()) {
	  		JOptionPane.showMessageDialog(null, digitado);
	  	}
	  	
	  	JOptionPane.showConfirmDialog(null, "o que é a vida?");
		
}
	
	int opcao = JOptionPane.showConfirmDialog(null, "mensagem");
	
	if(opcao == 0) {
		JOptionPane.showMessageDialog(null, "SIM");
		
	}
	if(opcao == 1) {
	 JOptionPane.showMessageDialog(null, "nao"); 	
	}
	}
 }

