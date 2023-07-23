
import javax.swing.JOptionPane;

/*
      - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano
      
      - coversor de temperatura 
*/
public class class_Challenge {

	private double moneda;
	private double Dolar;
	private double Euros;
	private double libraEsterlina;
	private double yenJapones;
	private double wonScoreano;
	private double Temperatura;

	protected String cm;
	protected String local = "pesos a extranjera"; // moneda local
	protected String extranjera = "extranjera a pesos"; // moneda extranjera
	protected String cmh;
	protected String cm2;
	protected int option; // comparar continuar si o no

	public class_Challenge() {

	}

	// menu seleccion de cambio
	public String menu1() {
		String menu = (JOptionPane
				.showInputDialog(null, "elige una opcion", "menu de conversiones", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "conversor de temperatura", "conversor moneda" }, "cancelar")
				.toString());
		if (menu == "conversor moneda") {
			String menu1 = (JOptionPane
					.showInputDialog(null, "moneda local o extranjera", "especifica", JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "pesos a extranjera", "extranjera a pesos" }, "cancelar")
					.toString());
			menu = menu1;
		}
		while (true) {
			try { // solo doubles y break hasta que sea falso
				setMoneda(Double.parseDouble(JOptionPane.showInputDialog("introduce el valor:")));
				setTemperatura(getMoneda());
				break;
			} catch (NumberFormatException | NullPointerException e) {

				JOptionPane.showMessageDialog(null, "El valor ingresado no es valido. Inténtelo de nuevo.");
			}
		}
		if (menu == "conversor de temperatura") { // temperatura
			String menu1 = (JOptionPane
					.showInputDialog(null, "unidad de temperatura", "especifica", JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "fahrenheit a celsius", "celsius a fahrenheit" }, "cancelar")
					.toString());

			switch (menu1) {
			case "fahrenheit a celsius":
				menu1 = "fahrenheit a celsius";
				JOptionPane.showMessageDialog(null,
						"equivalen a : " + ((this.Temperatura - 32)/1.8) + " celcius");
				break;
			case "celsius a fahrenheit":
				menu1 = "celsius a fahrenheit";
				JOptionPane.showMessageDialog(null,
						"equivalen a : " + ((this.Temperatura *1.8) + 32) + " fahrenheit");
				break;
			}
			menu = menu1;
		}

		return cm = menu;
	}

	// menu tipo de moneda
	public String menu2() {
		String menu2 = (JOptionPane
				.showInputDialog(null, "M.extranjera a pesos", "menu", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "Dolar a pesos Colombiano", "Euros a pesos Colombiano",
								"libra Esterlina a pesos Colombiano", "yen japones a pesos Colombiano",
								"won koreano a pesos Colombiano" },
						"cancelar")
				.toString());
		return cm2 = menu2;
	}

	public String menu2_1() {
		String menu2_1 = (JOptionPane
				.showInputDialog(null, "pesos a M. estranjera", "menu", JOptionPane.PLAIN_MESSAGE, null,
						new Object[] { "pesos Colombiano a Dolar", "pesos Colombiano a Euros",
								"pesos Colombiano a libra Esterlina", "pesos Colombiano a yen japones",
								"pesos Colombiano won koreano" },
						"cancelar")
				.toString());
		return cm2 = menu2_1;
	}

	public double getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.Temperatura = temperatura;
	}

	public double getMoneda() {
		return moneda;
	}

	public void setMoneda(double moneda) {
		this.moneda = moneda;
	}

	public double getDolar() {
		JOptionPane.showMessageDialog(null, "equivalen a : " + Dolar + "pesos");
		return Dolar;
	}

	public void setDolar(double dolar) {
		this.Dolar = dolar * 4173.00;

	}

	public double getEuros() {
		JOptionPane.showMessageDialog(null, "equivalen a : " + Euros + "pesos");
		return Euros;
	}

	public void setEuros(double euros) {
		this.Euros = euros * 4525.34;
	}

	public double getLibraEsterlina() {
		JOptionPane.showMessageDialog(null, "equivalen a : " + libraEsterlina + " pesos");
		return libraEsterlina;
	}

	public void setLibraEsterlina(double libraEsterlina) {
		this.libraEsterlina = libraEsterlina * 5287.70;
	}

	public double getYenJapones() {
		JOptionPane.showMessageDialog(null, "equivalen a : " + yenJapones + " pesos");
		return yenJapones;
	}

	public void setYenJapones(double yenJapones) {
		this.yenJapones = yenJapones * 28.79;
	}

	public double getWonScoreano() {
		JOptionPane.showMessageDialog(null, "equivalen a : " + wonScoreano + " pesos");
		return wonScoreano;
	}

	public void setWonScoreano(double wonScoreano) {
		this.wonScoreano = wonScoreano * 3.21;
	}

}
