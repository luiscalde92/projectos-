
public class conversor_de_moneda {

	public static void main(String[] args) {

		class_Challenge conversor = new class_Challenge();
		conversor_moneda conversor_1 = new conversor_moneda();
		
		
		try {
			while (conversor_1.option == 0) {
 
				conversor.menu1(); // menu conversor unidades.
				 
				if (conversor.cm.equals(conversor.extranjera)) {// moneda local
					if (conversor.getMoneda() > 0) {
						conversor.menu2(); // menu desplegable ;seleccion
						conversor_1.conversorExtranjero(conversor.cm2, conversor.getMoneda());
					}
				}

				if (conversor.cm.equals(conversor.local)) {// moneda extranjera
					if (conversor.getMoneda() > 0) {
						conversor.menu2_1(); // menu desplegable ;seleccion
						conversor_1.conversorLocal(conversor.cm2, conversor.getMoneda());
					}
				}
				conversor_1.option1();
			}

		} catch (NullPointerException e) {
			conversor_1.option2();
		}

	}
}
