
public class ControleBonificacao {
	
	private double soma;
	

	public void registra(Funcionario f){
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
//	public void registra(EditorDeVideo e){
//		double boni = e.getBonificacao();
//		this.soma = this.soma + boni;
//	}
//	
	
//	public void registra(Gerente g){
//	double boni = g.getBonificacao();
//	this.soma +=boni;
// 	
	// esses dois metodos s�o desnecess�rios, pois editores e gerentes s�o funcionarios.
//	

	
	public double getSoma() {
		return soma;
	}
	
}
