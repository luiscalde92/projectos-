import javax.swing.JOptionPane;

public class conversor_de_moneda {

	public static void main(String[] args) {

		class_Challenge conversor = new class_Challenge();
		conversor_moneda conversor_1 = new conversor_moneda();

		conversor.menu1(); // menu moneda.
	
		
		while (true) {
		    try { // solo doubles y break hasta que sea falso 
		    	conversor.setMoneda(Double.parseDouble(JOptionPane.showInputDialog("introduce el valor:")));
		        break;
		    } catch (NumberFormatException e) {
		        JOptionPane.showMessageDialog(null, "El valor ingresado no es valido. Inténtelo de nuevo.");
		    }
		}

		
		if (conversor.cm.equals(conversor.extranjera)) {// moneda local
			if (conversor.getMoneda() > 0) {
				conversor.menu2();                      // menu desplegable ;seleccion
				conversor_1.conversorExtranjero(conversor.cm2, conversor.getMoneda());
			}
		}

		if (conversor.cm.equals(conversor.local)) {// moneda extranjera
			if (conversor.getMoneda() > 0) {
				conversor.menu2_1();               // menu desplegable ;seleccion
				conversor_1.conversorLocal(conversor.cm2, conversor.getMoneda());
			}
		}
		
		conversor_1.option();
		

		/*
		 * INGRESAR DATO RN STRING TRANSFORMAR EN DOUBLE Y ASIGANARLO A OBJETO
		 * conversor.setMoneda(Double.parseDouble(JOptionPane.showInputDialog("introduce
		 * los dolares:"))); JOptionPane.showMessageDialog(null, "equivalen a : " +
		 * conversor.getMoneda());
		 */
//
//		Object obj = new Object();
//		String str = "Hola";
//		if (str.equals(obj.toString())) {
//		    // El objeto y el String son iguales
//		}	

//		if (cm2.equals(conversor.cmh)) {
//			System.out.println("voy aqui");
//			conversor.setDolar(conversor.getMoneda());
//			conversor.getDolar();
//		}

//		 String comparador = conversor.menu1(); if (comparador ==
//		 "conversor de moneda") { conversor.setMoneda(Double.parseDouble(JOptionPane.
//		 showInputDialog("introduce los dolares:")));
//		  JOptionPane.showMessageDialog(null, "equivalen a :" + conversor.getMoneda());
//		  }
//		 

		/*
		 * menu por botones String[] tipoMoneda1 = {"DOLAR", "EUROS",
		 * "LIBRA ESTERLINA","YEN JAPONES","WON SUR COREANO"};
		 * 
		 * String tipoMoneda11 = (String) JOptionPane.showInputDialog(null,
		 * "Selecciona una opción:", "Menú desplegable", JOptionPane.PLAIN_MESSAGE,
		 * null, tipoMoneda11[0]); JOptionPane.showMessageDialog(null,
		 * "La opción seleccionada es " + conversor.getMoneda());
		 */
		// menu

		/*
		 * menu plegable String menu = (JOptionPane.showInputDialog(null,
		 * "elige una opcion","menu", JOptionPane.PLAIN_MESSAGE,null,new Object[]
		 * {"conversor moneda","temperatura"}, "menu").toString());
		 * JOptionPane.showMessageDialog(null, "elegiste : " + menu + "menu");
		 */

		/*
		 * String[] menu = { "conversor moneda","temperatura" }; int seleccionMenu =
		 * JOptionPane.showOptionDialog(null, "Que conversion deseas hacer :",
		 * "Menú desplegable", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		 * null, menu, menu[0]); System.out.println("Seleccionaste la opción " +
		 * (seleccionMenu + 1));
		 */

		/*
		 * String[] tipoMoneda1 = { "DOLAR", "EUROS", "LIBRA ESTERLINA", "YEN JAPONES",
		 * "WON SUR COREANO" }; int seleccionMoneda = JOptionPane.showOptionDialog(null,
		 * "Selecciona una opción", "Menú desplegable", JOptionPane.DEFAULT_OPTION,
		 * JOptionPane.PLAIN_MESSAGE, null, tipoMoneda1, tipoMoneda1[0]);
		 * System.out.println("Seleccionaste la opción " + (seleccionMoneda + 1));
		 */

	}
}
