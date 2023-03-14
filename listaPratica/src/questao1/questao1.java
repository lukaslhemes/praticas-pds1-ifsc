package questao1;

import javax.swing.JOptionPane;

public class questao1 {
	
	public static void main(String[]args) {

		String preco = JOptionPane.showInputDialog("Insira o preço do litro: ");
		String qtd = JOptionPane.showInputDialog("Insira a quantidade de litros: ");
		
		Double preco = Double.valueOf(precoLitro);
		Double qtd = Double.valueOf(qtdLitro);
		 
		JOptionPane.showMassageDialog(null,"O valor a pagar é:" + valorapagar(preco,qtd));
	}
	
		public static double valorapagar(Double precoLitro,Double qtdLitro) {
			
		return(precoLitro*qtdLitro);
			
	}

}
