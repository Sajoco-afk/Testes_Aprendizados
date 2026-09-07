public class Notas{
	public static void main(String[] args) {
		var nota1 = 4.5;
		var nota2 = 5.8; 
		var nota3 = 5.5;
		int frequencia = 60;

		var media = (nota1 + nota2 + nota3) / 3; 

		if (media >= 6.0) {
			System.out.println("Você foi aprovado! " + media);
		} else {
			System.out.println("Você foi reprovado! " + media);
		} 	if (frequencia >= 75) {
			System.out.println("Você atingiu a frequencia minima: " + frequencia + "%");
		}	else {
			System.out.println("Você não atingiu a frequencia minima: " + frequencia + "%");
		}

	}



















	
}
