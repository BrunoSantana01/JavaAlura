
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
	// esses dois metodos são desnecessários, pois editores e gerentes são funcionarios.
//	

	
	public double getSoma() {
		return soma;
	}
	
}
