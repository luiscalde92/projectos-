import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class conversor_moneda extends class_Challenge {
	
	DecimalFormat df = new DecimalFormat("#.###");//quitar decimales
	protected double valorMoneda;

	// conversor extranjero
	
	
	public double conversorExtranjero(String seleccion, double valor_a_cambiar) {

		switch (seleccion) {
		case "Dolar a pesos Colombiano":
			super.setDolar(valor_a_cambiar);
			valorMoneda = super.getDolar();
			break;

		case "Euros a pesos Colombiano":
			super.setEuros(valor_a_cambiar);
			valorMoneda = super.getEuros();
			break;

		case "libra Esterlina a pesos Colombiano":
			super.setLibraEsterlina(valor_a_cambiar);
			valorMoneda = super.getLibraEsterlina();
			break;

		case "yen japones a pesos Colombiano":
			super.setYenJapones(valor_a_cambiar);
			valorMoneda = super.getYenJapones();
			break;

		case "won koreano a pesos Colombiano":
			super.setWonScoreano(valor_a_cambiar);
			valorMoneda = super.getWonScoreano();
			break;
		}
		return valorMoneda;

	}

	// conversor local
	public double conversorLocal(String seleccion, double valor_a_cambiar) {
		String Moneda = null;
		switch (seleccion) {
		case "pesos Colombiano a Dolar":
			valorMoneda = valor_a_cambiar * 0.00024;
			Moneda = "Dolar";
			break;

		case "pesos Colombiano a Euros":
			valorMoneda = valor_a_cambiar * 0.00022;
			Moneda = "Euros";
			break;

		case "pesos Colombiano a libra Esterlina":
			valorMoneda = valor_a_cambiar * 0.00019;
			Moneda = "libra ES";
			break;

		case "pesos Colombiano a yen japones":
			valorMoneda = valor_a_cambiar * 0.034;
			Moneda = "yen Esterlina";
			break;

		case "pesos Colombiano won koreano":
			valorMoneda = valor_a_cambiar * 0.31;
			Moneda = "Won KOr";
			break;
		}
		JOptionPane.showMessageDialog(null, "equivalen a : " + df.format(valorMoneda) + " " + Moneda);
		return valorMoneda;
	}

	

	public int option1() {
		option = Integer.valueOf(JOptionPane.showInternalConfirmDialog(null, "Deseas continuar", "escoje una opcion",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE));
		switch (option) {
		case 0:
			// JOptionPane.showMessageDialog(null, "equivalen a : " );
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Fin de programa");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Ups...! Cancelaste ");
			break;
		}
		return this.option;
	}
	
	public  void option2() {
		JOptionPane.showMessageDialog(null,"Programa Finalizado",null, JOptionPane.INFORMATION_MESSAGE);
		option=1;
	}

}
