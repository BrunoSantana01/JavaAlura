public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais.");

		int idade = 20;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Maior de idade");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2){
				System.out.println("voc� n�o tem mais de 18 anos, mas pode entrar, "
						+ "pois est� acompanhado");
			}else System.out.println("Infelizmente voc� n�o pode entrar.");
		}
	}
}
