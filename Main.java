public class Main{
	public static void main(String[] args) {
		int codigoDeSaida = 11;

		for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

			if (codigoCarteirinha == codigoDeSaida) {
				System.out.println("Código de sainda encontrado, Encerrando! ");
			break;
			}

			if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
				System.out.println("Código aceito! " + codigoCarteirinha);
				continue;
			}

			System.out.println("Código recusado! " + codigoCarteirinha);

		}
	}
}