
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais.");

		int idade = 16;
		int quantidadePessoas = 3;
		
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println("valor de acompanhado " + acompanhado);
		if (idade >= 18 || acompanhado) { // || quantidadePessoas >= 2
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}

	}
}
