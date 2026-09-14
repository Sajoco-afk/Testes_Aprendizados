public class Main{
	public static void main(String[] args) {
		//Metodo For
		for (int i = 0; i < 10; i++) { //Verifica e Soma	
			System.out.println(i);	   //Imprime
		}
		//Metodo While
		int j = 0;
		while (j < 10) {			//Verifica
			System.out.println(j);	//Imprime
			j++;					//Soma
		}
		//Metodo Do While
		int k = 20;
		do {
			System.out.println(k);// Imprime
			k++;                  // Soma
		}while (k < 10);		  //Verifica
		//Metodo Break
		for (int o = 0; o < 10; o++) {
			if (o == 10) {
				break; // Sai do loop
			}
			System.out.println(o);
		} 
		//Metodo Continue
		for (int u = 0; u < 10; u++) {
			if (u == 5) { //Pula o numero escolhido
				continue; // Pula interação
			}
			System.out.println(u);
		}		
	}
}
